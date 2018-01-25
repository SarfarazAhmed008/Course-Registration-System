package registrationui;

import static java.lang.Math.ceil;

public class BDTaxAdapter implements IExtraFeeCalculator{
    BDTAXCalculator btc= new BDTAXCalculator();
    
    @Override
    public int getExtraAmount(int courseTotal) {
       return (int) ceil(btc.calculateVATAmount(courseTotal));
    }

    @Override
    public int getTaxPercentage() {
       return btc.getTaxPercentage();
    }
    
}
