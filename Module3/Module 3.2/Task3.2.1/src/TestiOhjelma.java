public class TestiOhjelma {
    public static void main(String[] args) {
        Car car = new Car("Car","Petrol","Red");
        Bus bus = new Bus("Bus", "Diesel","Blue");
        Motorcycle motorcycle = new Motorcycle("Motorcycle","Petrol","Yellow");

        car.start();
        car.getInfo();


    }
}
