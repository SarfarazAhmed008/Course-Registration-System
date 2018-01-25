package registrationui;
public class Course {
    String id,title;
    int credit,tutionPerCredit;
    
    void setId(String id){
        this.id=id;        
    }
    void setTitle(String title){
        this.title=title;
    }
    void setCredit(int credit){
        this.credit=credit;
    }
    void setTutionPerCredit(int tutionPerCredit){
        this.tutionPerCredit=tutionPerCredit;
    }
    String getId(){
        return id;
    }
    String getTitle(){
        return title;
    }
    int getCredit(){
        return credit;
    }
    int getTutionPerCredit(){
        return tutionPerCredit;
    }
    
    int getSubTotal(){
        return credit*tutionPerCredit;
    }
}
