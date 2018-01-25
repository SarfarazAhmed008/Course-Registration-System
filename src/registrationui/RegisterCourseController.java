package registrationui;

import java.sql.SQLException;
import java.util.LinkedList;

public class RegisterCourseController {
    Registration reg;
    PersistenceFacade cf;
    
    public RegisterCourseController() throws SQLException{
        cf= new PersistenceFacade();
        reg= new Registration();
    }
    public void addCourse(String id){
        reg.addCourse((Course) cf.get(id,Admin.class));   
    }
    public Course getCourse(String id){
        if((Course) cf.get(id, Admin.class) != null){
            return (Course) cf.get(id,Admin.class);
        }
        else return null;
    }
    public boolean checkDubCourse(String id){
        return reg.checkDupCourse(id);
    }
    
    public LinkedList getRegCourse(){
        return reg.courseList;
    }
    public void removeCourse(String title){
        for(Course c:reg.courseList){
            if(c.getTitle().equals(title)){
                reg.courseList.remove(c);
            }
            else continue;
        }
    }
    public void clearList(){
        reg.courseList.clear();
    }
    public int getTotal(){
        return reg.getTotal();
    }
    public int getGrandTotal(){
        return reg.getGrandTotal();
    }
    
    public IDiscountStrategy getDiscountPloicy(String policy){
        return reg.getDiscountPolicy(policy);
    }
    
    public int getDiscount(String policy){
        return reg.getDiscount(policy);
    }
    
    public CompositeDiscount bestForNsu(){
    
       return reg.bestForNsu();
    }
    public CompositeDiscount bestForStudent(){
    
       return reg.bestForStudent();
    }
    public void addCompositeDiscount(IDiscountStrategy ids){        
      reg.addCompositeDiscount(ids);
    }
    
    public CompositeDiscount getCompositeDisocunt(){
        return reg.getCompositeDiscount();
    }    
    public int getTaxPercentage(){
        return reg.getTaxPercentage();
    }
    public int getExtraFeeAmount(){    
        return reg.getExtraFeeAmount();
    }
}
