
package registrationui;

import java.awt.Toolkit;

public class MakeSound implements Subscriber{

    Publisher event;
    
    @Override
    public void setEvent(Publisher sub) {
        this.event=sub;
    }
    
   @Override
    public void update() {
      String msg = (String) event.getUpdate(this);
	if(msg.equals("0")){
            System.out.println("No Event");
	}else{
            Toolkit.getDefaultToolkit().beep();
        }
            
    }


}
