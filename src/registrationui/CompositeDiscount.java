package registrationui;
import java.util.LinkedList;

public class CompositeDiscount implements IDiscountStrategy{
    public static LinkedList<IDiscountStrategy> disList;
    public CompositeDiscount(){
        disList= new LinkedList<>();
    }

    @Override
    public int getDiscount(Registration reg) {
       return 0;
    }
    
    public void addDiscount(IDiscountStrategy ids){
        disList.add(ids);
    }
    
}
