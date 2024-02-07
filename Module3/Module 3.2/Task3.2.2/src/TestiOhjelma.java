public class TestiOhjelma {
    public static void main(String[] args) {
        Car car = new Car("Car","Petrol","Red");
        Bus bus = new Bus("Bus", "Diesel","Blue");
        Motorcycle motorcycle = new Motorcycle("Aprilia", "Petrol","red");

        car.start();

        car.honk();

        car.getInfo();

        bus.start();
        bus.honk();

        bus.getInfo();

        motorcycle.start();
        motorcycle.honk();
        motorcycle.getInfo();

    }
}
