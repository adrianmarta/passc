public class TextDisplay implements observer {
    private int value;
    private String location;
    public TextDisplay()
    {

    }
    public void update(TemperatureSensor s)
    {
        this.value=s.getTemp();
        this.location=s.getLocation();
        display();
    }
    public void display()
    {
        System.out.println("locatia: "+ location );
        if(value<20)
        {
            System.out.println("cold");
        }
        else {
            System.out.println("warm");
        }
    }
}
