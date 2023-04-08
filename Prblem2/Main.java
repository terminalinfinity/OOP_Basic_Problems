package Prblem2;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();
        myCar.accelerate();
        myCar.displayCurrentSpeed();
        myCar.accelerate();
        myCar.accelerate();
        myCar.displayCurrentSpeed();
        myCar.decelerate();
        myCar.displayCurrentSpeed();
        myCar.stopEngine();
        myCar.displayCurrentSpeed();

    }
}
