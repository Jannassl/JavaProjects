public class Car extends AbstractVehicle {

    private String type;
    private String color;
    private String fuel;

    public Car(String type, String fuel, String color){
        super(type,fuel,color);

    }
    @Override
    public void start(){
        System.out.println("Car is starting..");
    }
    @Override
    public void stop() {

        System.out.println("Car is turning off...");
    }
    @Override
    void honk(){
        System.out.println("Beep beep");
    }
    @Override
    public void getInfo() {
        System.out.println("Vehicle information: ");
        System.out.println("Type: "+ getType());
        System.out.println("fuel: "+ getFuel());
        System.out.println("color: "+ getColor());
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
