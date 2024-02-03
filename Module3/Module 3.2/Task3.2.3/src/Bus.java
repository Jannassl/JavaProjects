public class Bus extends AbstractVehicle {
    private String status;
    private String type;
    private String color;
    private String fuel;

    public Bus(String type, String fuel, String color){
        super(type, fuel, color);
    }
    @Override
    public void start(){
        System.out.println("Bus is starting..");
    }
    @Override
    public void stop() {

        System.out.println("Bus is turning off...");
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
        System.out.println("This vehicle is not electric!");
    }
}
