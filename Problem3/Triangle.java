package Problem3;

public class Triangle extends Shape {
    public Triangle(double length, double width, double height) {
        super(length, width, height);
    }

    public double getArea() {
        return 0.5 * length * height;
    }

    public double getPerimeter() {
        return length + width + height;
    }
}