package registrationui;
public class BestForStudentStrategy extends CompositeDiscount{
    
     @Override
     public int getDiscount(Registration reg){
        int amount=0;
        for(IDiscountStrategy ids:disList){
           if(ids.getDiscount(reg)>amount){
               amount=ids.getDiscount(reg);
           }
        }
        return amount;
    } 
}
