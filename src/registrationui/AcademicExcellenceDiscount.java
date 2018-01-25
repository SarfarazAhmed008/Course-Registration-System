
package registrationui;

public class AcademicExcellenceDiscount implements IDiscountStrategy{
    String type="AED";
    @Override
    public int getDiscount(Registration reg) {
        return (int) ((reg.getTotal()+reg.getExtraFeeAmount())*0.70);//70%
    }
    
}
