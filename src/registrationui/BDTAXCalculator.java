
package registrationui;

public class BDTAXCalculator {

    public float calculateVATAmount(int total){
        return (float) (total*0.15);
    }
    public int getTaxPercentage(){
        return 15;
    }
    
}
