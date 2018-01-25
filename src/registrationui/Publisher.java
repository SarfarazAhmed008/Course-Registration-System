package registrationui;
public interface Publisher {
    public void register(Subscriber obj);
    public void unregister(Subscriber obj);
    public void notifyObservers();
    public Object getUpdate(Subscriber obj);
}
