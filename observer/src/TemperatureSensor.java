import java.util.ArrayList;

public class TemperatureSensor implements subject {
    private ArrayList<observer> observers;
    private int tempState;
    private int ID , precision;
    private String location, date;


    public TemperatureSensor(int initialTemp) {
        tempState = initialTemp;
        observers = new ArrayList<observer>();
    }

    public int getTemp() {
        return tempState;
    }

    public void setTemp(int newTemp) {
        tempState = newTemp;
        notifyObservers();
    }
    public void setLocation(String newLocation)
    {
        location=newLocation;
    }
    public String getLocation()
    {
        return location;
    }
    public void setID(int newID)
    {
        ID=newID;
    }
    public int getID()
    {
        return ID;
    }
    public void setPrecision(int newPrecision)
    {
        precision=newPrecision;
    }
    public int getPrecision()
    {
        return precision;
    }
    public void setDate(String newDate)
    {
        date=newDate;
    }
    public String getDate()
    {
        return date;
    }

    public void attach(observer o) {
        observers.add(o);
    }

    public void detach(observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (observer o : observers)
            o.update(this);
    }

}
