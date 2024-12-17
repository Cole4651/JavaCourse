import java.util.Scanner;

public class CircleTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = input.nextFloat();

        Circle circle = new Circle(radius);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Diameter: " + circle.getDiameter());
        System.out.println("Circumference: " + circle.getCircumference());
    }
}
