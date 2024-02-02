abstract class AbstractVehicle implements Vehicle {
    protected String type;
    protected String fuel;
    protected String  color;

    public AbstractVehicle(String type, String fuel, String color) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;
    }
    abstract void honk();

    @Override
    public void getInfo() {
        System.out.println("Vehicle information: ");
        System.out.println("Type: "+ type);
        System.out.println("fuel: "+ fuel);
        System.out.println("color: "+ color);
    }

    // Common methods for all vehicles
    @Override
    public void start() {
        System.out.println("Starting the " + type);
    }

    @Override
    public void stop() {
        System.out.println("Stopping the " + type);
    }
}
