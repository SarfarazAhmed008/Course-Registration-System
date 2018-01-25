
package registrationui;

import java.awt.Toolkit;

public class PopulateDisBox implements Subscriber{
    
    Publisher event;
    
    @Override
    public void setEvent(Publisher sub) {
        this.event=sub;
    }
     public void update() {
        String msg = (String) event.getUpdate(this);
	if(msg.equals("0")){
            System.out.println("No Event");
	}else{
            RegistrationUI.discount.setText(msg);
        }
    }
    
}
