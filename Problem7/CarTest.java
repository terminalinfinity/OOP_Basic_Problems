package Problem7;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2018, 10000);
        System.out.println("Make: " + car1.getMake());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Mileage: " + car1.getMileage());

        car1.setMileage(15000);
        System.out.println("New mileage: " + car1.getMileage());

        Car car2 = new Car("Honda", "Accord", 2019, 20000);
        System.out.println("Make: " + car2.getMake());
        System.out.println("Model: " + car2.getModel());
        System.out.println("Year: " + car2.getYear());
        System.out.println("Mileage: " + car2.getMileage());

        car2.setMake("Ford");
        System.out.println("New make: " + car2.getMake());
    }
}
