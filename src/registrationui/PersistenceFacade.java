package registrationui;
import java.sql.SQLException;
import java.util.HashMap;


public class PersistenceFacade {
    HashMap <Class,IMapper> mappers;
   
    public PersistenceFacade() throws SQLException {
        this.mappers = new HashMap <> ();   
        mappers.put(Admin.class,(IMapper) new AddCourse());
        mappers.put(RegistrationUI.class, (IMapper) new RegistrationRDBMapper());
    }
 
    public Object get (String oid, Class   persistenceClass) {
        IMapper mapper = (IMapper) mappers.get (persistenceClass);
        return  mapper.get(oid) ;
    }
    
    public int put(String OID, Object obj, Class cs){
         IMapper mapper=(IMapper) mappers.get(cs);
         return mapper.put(OID, obj);
    }
}
  
