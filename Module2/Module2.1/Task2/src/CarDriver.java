public class CarDriver {

    public static void main(String[] args) {
        Car myCar;
        Car myCar2;


        myCar = new Car("Toyota Corolla");
        myCar2 = new Car("Honda Civic",40,170);
        myCar.fillTank();
        for(int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while(myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }
    }
}