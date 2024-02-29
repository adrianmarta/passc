public class MainDriver {
    public static void main(String[] args) {
        TemperatureSensor s=new TemperatureSensor(7);

        NumericDisplay o1=new NumericDisplay();
        TextDisplay o2 = new TextDisplay();
        AverageDisplay o3=new AverageDisplay();

        s.attach(o1);
        s.attach(o2);

        s.setTemp(24);
        s.setTemp(11);

        s.detach(o2);
        s.attach(o3);

        s.setTemp(10);
        s.setTemp(1);
    }
}
