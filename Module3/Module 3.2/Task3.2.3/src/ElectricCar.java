public class ElectricCar extends AbstractVehicle{
    private String type;
    private String color;
    private String fuel;

    public ElectricCar(String type, String fuel, String color){
        super(type, fuel, color);

    }
    @Override
    public void start(){
        System.out.println("Electric car is starting..");
    }
    @Override
    public void stop() {

        System.out.println("Electric car is turning off...");
    }

    @Override
    void honk(){
        System.out.println("Beep Beep!!");
    }

    public String getColor() {
        return color;
    }

    public String getFuel() {
        return fuel;
    }
    @Override
    public void charge() {
        System.out.println("Charging....");
    }
}
