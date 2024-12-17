public class Circle {
    final double PI = 3.14159;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        radius = 0;
    }

    public double getRadius() {
        return radius;
    } 

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }
}
