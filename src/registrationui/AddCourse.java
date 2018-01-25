package registrationui;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddCourse implements IMapper{
    
    DBManager dbm;
    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
    public AddCourse() throws SQLException{
        dbm=new DBManager();
        con=dbm.connectDB();
        ps= con.prepareStatement("INSERT INTO course (Name, ID, Credit, Fee) VALUES (?,?,?,?)");
        st=con.createStatement();
        
    }
    @Override
    public Object get(String OID) {
        Course ad= null;
        try {
            rs=st.executeQuery("Select * from course where ID='"+OID+"'");
            if(!rs.next()){
                ad=null;                
            }else {
                ad=new Course();
                do{
                    ad.setTitle(rs.getString(1));
                    ad.setId(rs.getString(2));
                    ad.setCredit(Integer.valueOf(rs.getString(3))); 
                    ad.setTutionPerCredit(Integer.valueOf(rs.getString(4)));
                } while(rs.next());
            }
  
        } catch (SQLException ex) {
            Logger.getLogger(AddCourse.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ad;
    }

    @Override
    public int put(String OID, Object obj) {
        
        int success=0;
        try {
            Admin ad= (Admin)obj;
            ps.setString(1,ad.getCName());
            ps.setString(2,ad.getCCode());
            ps.setInt(3, ad.getCCredit());
            ps.setInt(4,ad.getCreditFee());
            success=ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AddCourse.class.getName()).log(Level.SEVERE, null, ex);
        }
        return success;
    }
    
}
