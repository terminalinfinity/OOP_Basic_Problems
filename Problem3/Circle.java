package Problem3;

public class Circle extends Shape {
    public Circle(double radius) {
        super(radius, 0, 0);
    }

    public double getArea() {
        return Math.PI * length * length;
    }

    public double getPerimeter() {
        return 2 * Math.PI * length;
    }
}