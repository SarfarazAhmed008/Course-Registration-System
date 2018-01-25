package registrationui;
public interface IExtraFeeCalculator {
    
    public int getExtraAmount(int courseTotal);
    public int getTaxPercentage();
}
