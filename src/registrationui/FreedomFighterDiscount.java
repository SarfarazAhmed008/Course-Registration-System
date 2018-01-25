package registrationui;
public class FreedomFighterDiscount implements IDiscountStrategy{
    String type="FFD";
    @Override
    public int getDiscount(Registration reg) {
        return (int) ((reg.getTotal()+reg.getExtraFeeAmount()));//100%
    }
}
