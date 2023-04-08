package Problem3;

public class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length, width, 0);
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}