public class Bus extends AbstractVehicle {
    private String status;
    private String type;
    private String color;
    private String fuel;

    public Bus(String type, String fuel, String color, double efficiency){
        super(type, fuel, color,efficiency);
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
    @Override
    void displayEfficiency(){
        System.out.println(getEfficiency()+"l/ 100km");
    }
    public String getColor() {
        return color;
    }

    public String getFuel() {
        return fuel;
    }

    @Override
    public double CalculateEfficiency() {
       return efficiency;
    }
}
