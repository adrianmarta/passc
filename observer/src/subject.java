import java.util.ArrayList;

public interface subject {
    public void attach(observer o);
    public void detach(observer o);
    public void notifyObservers();
}

