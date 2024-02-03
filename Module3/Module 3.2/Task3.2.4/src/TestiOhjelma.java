public class TestiOhjelma {
    public static void main(String[] args) {
        Car car = new Car("Car","Petrol","Red", 6.5);
        Bus bus = new Bus("Bus", "Diesel","Blue", 9.0);
        Motorcycle motorcycle = new Motorcycle("Aprilia", "Petrol","red", 5.4);

        car.start();
        car.displayEfficiency();

    }
}
