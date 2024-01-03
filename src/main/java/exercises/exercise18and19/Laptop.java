package exercises.exercise18and19;

public class Laptop extends Computer{
    private String battery;
    public Laptop(String processor, String ram, String graphicsCard, String company, String model, String battery) {
        super(processor, ram, graphicsCard, company, model);
        this.battery = battery;
    }

    public Laptop(Computer computer, String battery) {
        super(computer);
        this.battery = battery;
    }
}
