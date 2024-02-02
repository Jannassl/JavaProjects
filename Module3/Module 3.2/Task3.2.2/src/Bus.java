public class Bus extends AbstractVehicle {
    private String type;
    private String color;
    private String fuel;

    public Bus(String type, String fuel, String color){
        super(type,fuel,color);

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
    public void getInfo() {
        System.out.println("Vehicle information: ");
        System.out.println("Type: "+ getType());
        System.out.println("fuel: "+ getFuel());
        System.out.println("color: "+ getColor());
    }
    @Override
    void honk(){
        System.out.println("Beep beep");
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getFuel() {
        return fuel;
    }
}
