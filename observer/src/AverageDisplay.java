
import java.util.*;

public class AverageDisplay implements observer{
    private int value;
    private float contor;
    private int suma;
    private int preciosion,ID;
    private String location, date;
    private Map<Integer, Pair> a=new HashMap<Integer,Pair > ();


    public AverageDisplay(){}
    public void update(TemperatureSensor s)
    {
        this.value=value;

        ID=s.getID();
        preciosion=s.getPrecision();
        location=s.getLocation();
        date=s.getDate();
        display();
    }
    public void display(){
        System.out.println("precision="+preciosion);
        System.out.println("ID="+ID);
        System.out.println("location="+location);
        System.out.println("date="+date);
        float average=suma/contor;
        System.out.println("average value= " + average);
    }
}
