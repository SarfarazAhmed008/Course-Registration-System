
package registrationui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistrationRDBMapper implements IMapper{
      
    DBManager dbm;
    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    public RegistrationRDBMapper() throws SQLException{
        dbm=new DBManager();
        con=dbm.connectDB();
        ps= con.prepareStatement("INSERT INTO registration (Title, Credit, Subtotal, Student_ID) VALUES (?,?,?,?)");
        st=con.createStatement();
    }
    @Override
    public Object get(String OID) {
        Course ad= null;
        return ad;
    }

    @Override
    public int put(String OID, Object obj) {
        int success=0;         
        try {
            
            for(int i=0;i<RegistrationUI.courseTable.getModel().getRowCount()-1;i++){
                ps.setString(1, (String)RegistrationUI.courseTable.getModel().getValueAt(i, 1));
                ps.setInt(2,(Integer)RegistrationUI.courseTable.getModel().getValueAt(i, 2)); 
                ps.setInt(3,(Integer)RegistrationUI.courseTable.getModel().getValueAt(i, 4));
                ps.setInt(4,1320168042);
                success=ps.executeUpdate();
            }
////              for(int i=0;i<rui.courseTable.getModel().getRowCount();i++){
//                ps.setString(1, RegistrationUI.courseTable.getModel().getValueAt(0, 1).toString());
//                ps.setInt(2,Integer.valueOf(RegistrationUI.courseTable.getModel().getValueAt(0, 2).toString())); 
//                ps.setInt(3,(Integer)RegistrationUI.courseTable.getModel().getValueAt(0, 4));
//                ps.setInt(4,1320168042);
//                success=ps.executeUpdate();
////            }
//             ps.setString(1,"CSE");
//                ps.setInt(2,3); 
//                ps.setInt(3,13500);
//                ps.setInt(4,1320168042);
//              success=ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrationRDBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return success;
    }
    
}
