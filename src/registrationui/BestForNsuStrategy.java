package registrationui;
public class BestForNsuStrategy extends CompositeDiscount{
     
     @Override
     public int getDiscount(Registration reg){  
        int amount=1000000;
        for(IDiscountStrategy ids:disList){
           if(amount>ids.getDiscount(reg)){
               amount=ids.getDiscount(reg);  
           }
        }
        return amount;
    }
}
