public class Motorcycle extends AbstractVehicle{
    private String status;
    private String type;
    private String color;
    private String fuel;

    public Motorcycle(String type, String fuel, String color){
        super(type, fuel, color);

    }
    @Override
    public void start(){
        System.out.println("Motorcycle is starting..");
    }
    @Override
    public void stop() {

        System.out.println("Motorcycle is turning off...");
    }

    @Override
    void honk(){
        System.out.println("Beep Beep!!");
    }
    void accelerate(){
        System.out.println(type+" has accelerated");
    }
    @Override
    public void charge() {
        System.out.println("This vehicle is not electric!");
    }


    public String getColor() {
        return color;
    }

    public String getFuel() {
        return fuel;
    }
}
