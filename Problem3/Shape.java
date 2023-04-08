package Problem3;

public abstract class Shape {
    protected double length;
    protected double width;
    protected double height;

    public Shape(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
