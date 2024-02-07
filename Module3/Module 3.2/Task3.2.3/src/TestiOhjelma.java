public class TestiOhjelma {
    public static void main(String[] args) {
        Car car = new Car("Car","Petrol","Red");
        Bus bus = new Bus("Bus", "Diesel","Blue");
        Motorcycle motorcycle = new Motorcycle("Aprilia", "Petrol","red");
        ElectricMotorycle electricMotorycle = new ElectricMotorycle("Kawasaki","Electric", "White");
        ElectricCar electricCar = new ElectricCar("Tesla", "Electric", "Black");

        electricCar.start();
        electricCar.charge();
        electricCar.getInfo();
        electricCar.stop();

        electricMotorycle.start();
        electricMotorycle.charge();
        electricMotorycle.getInfo();
        electricMotorycle.stop();

        car.charge();

    }
}
