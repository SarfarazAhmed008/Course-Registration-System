package registrationui;
import java.util.ArrayList;
import java.util.List;

public class ShowDiscount implements Publisher {
    private List<Subscriber> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX= new Object();
    
    public ShowDiscount(){
        this.observers=new ArrayList<>();
    }
    @Override
    public void register(Subscriber obj) {
        if(obj == null) throw new NullPointerException("Null Observer");
            synchronized (MUTEX) {
                if(!observers.contains(obj))
                    observers.add(obj);
            }
    }

    @Override
    public void unregister(Subscriber obj) {
        synchronized (MUTEX) {
            observers.remove(obj);
	}
    }

    @Override
    public void notifyObservers() {
        List<Subscriber> observersLocal = null;
		synchronized (MUTEX) {
                    if (!changed)
			return;
                    observersLocal = new ArrayList<>(this.observers);
                    this.changed=false;
		}
		for (Subscriber obj : observersLocal) {
			obj.update();
		}
    }

    @Override
    public Object getUpdate(Subscriber sbc) {
        return this.message;
    }
    public void postMessage(String msg){
	System.out.println("Message Posted to Topic:"+msg);
	this.message=msg;
	this.changed=true;
	notifyObservers();
    }
    
}
