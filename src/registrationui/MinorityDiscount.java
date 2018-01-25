package registrationui;
public class MinorityDiscount implements IDiscountStrategy{
    String type="MD";
    @Override
    public int getDiscount(Registration reg) {
        return (int) ((reg.getTotal()+reg.getExtraFeeAmount())*.50);//50%
    }
}
