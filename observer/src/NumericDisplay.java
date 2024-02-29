public class NumericDisplay implements observer {

    private int value;
    private String location;
    private int precision;

    public NumericDisplay() {
    }

    public void update(TemperatureSensor s) {
        this.value = s.getTemp();
        location=s.getLocation();
        precision=s.getPrecision();
        display();
    }

    public void display() {
        System.out.println("location = " + location);
        System.out.println("precision = " + precision);
        System.out.println("Current value = " + value);
    }
}
