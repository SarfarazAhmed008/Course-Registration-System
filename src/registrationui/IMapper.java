package registrationui;
public interface IMapper {
    public Object get(String OID);
    public int put(String OID, Object obj);
}
