package registrationui;

import static java.lang.Math.ceil;

public class DevelopmentFeeCalculator implements IExtraFeeCalculator{

    @Override
    public int getExtraAmount(int courseTotal) {
       return (int) ceil(courseTotal*0.1);
    }

    @Override
    public int getTaxPercentage() {
       return 10;
    }
    
}
