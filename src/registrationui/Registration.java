package registrationui;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Registration {
    LinkedList<Course> courseList=new LinkedList<>();
    IExtraFeeCalculator iefc;
    IDiscountStrategy ids;    
    CompositeDiscount cds;
    CompositeDiscount bfn;
    CompositeDiscount bfs;
    
    public Registration (){
       iefc=CourseFactory.getInstance().getExtraFeeCalculator(); 
       cds =new CompositeDiscount();
       bfn=new BestForNsuStrategy();      
       bfs=new BestForStudentStrategy();

    }
    public void addCourse(Course c){
        courseList.add(c);
    }

    public boolean checkDupCourse(String id){
        for(Course c:courseList){
            if(id.equals(c.getId()))
                return true;
        }
        return false;
    }
    
    public void clearList(){
        courseList.clear();
    }
    
    public int getTotal(){
        int total=0;
        for(Course c:courseList){            
            total=total+c.getSubTotal();
        }
        return total;
    }
    
    public int getGrandTotal(){
        return (getTotal()+getExtraFeeAmount());
    }
    
    public IDiscountStrategy getDiscountPolicy(String policy){
        try {
            try {
                ids=(IDiscountStrategy)Class.forName(policy).newInstance();
            } catch (InstantiationException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ids;
    }
    
    public int getDiscount(String policy){
        return this.getDiscountPolicy(policy).getDiscount(this);
    }
    public CompositeDiscount bestForNsu(){    
       return bfn;       
    }
    public CompositeDiscount bestForStudent(){    
       return bfs;
    }
    
    public CompositeDiscount getCompositeDiscount(){
        return cds;
    }
    
    public void removeDiscount(){
//        for(IDiscountStrategy ids : cds.disList){
//            if(ids)
//        }
    }
    public void addCompositeDiscount(IDiscountStrategy ids){        
        cds.addDiscount(ids); 
    }
    
    public int getExtraFeeAmount(){              
        return iefc.getExtraAmount(getTotal());
    }
    public int getTaxPercentage(){
        return iefc.getTaxPercentage();
    }
    
    
}
