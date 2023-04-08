package Problem7;
//Create a class called Car that has instance variables make, model, year, and mileage,
// and methods to get and set these variables. Write a program to test the class by creating
// instances of Car and calling the methods to get and set the variables.
public class Car {
        private String make;
        private String model;
        private int year;
        private int mileage;

        public Car(String make, String model, int year, int mileage) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.mileage = mileage;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }
    }