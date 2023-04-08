package Prblem2;

public class Car {
    private boolean isEngineOn;
    private int currentSpeed;
    private final int MAX_SPEED = 200;

    public Car() {
        isEngineOn = false;
        currentSpeed = 0;
    }

    public void startEngine() {
        isEngineOn = true;
        System.out.println("Engine started.");
    }

    public void stopEngine() {
        isEngineOn = false;
        System.out.println("Engine stopped.");
    }

    public void accelerate() {
        if (isEngineOn && currentSpeed < MAX_SPEED) {
            currentSpeed += 10;
            System.out.println("Speed increased to " + currentSpeed + " km/h.");
        }
    }

    public void decelerate() {
        if (currentSpeed > 0) {
            currentSpeed -= 10;
            System.out.println("Speed decreased to " + currentSpeed + " km/h.");
        }
    }

    public void displayCurrentSpeed() {
        System.out.println("Current speed: " + currentSpeed + " km/h.");
    }
}
