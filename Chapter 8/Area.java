public class Area extends AreaTester {

    public static void area(double radius) {
        double area = radius * radius * Math.PI;
        String rounded = String.format("%.2f", area);
        System.out.println("The area of the circle is " + rounded);
    }

    public static void area(double width, double height) {
        double area = Math.abs(width * height);
        String rounded = String.format("%.2f", area);
        System.out.println("The area of the reactangle is " + rounded);
    }

    public static void area(String cylinder, double radius, double height) {
        double area = Math.abs(radius * radius * Math.PI * height);
        String rounded = String.format("%.2f", area);
        System.out.println("The area of the " + cylinder + " is " + rounded);
    }
}
