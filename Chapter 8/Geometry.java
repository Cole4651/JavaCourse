public class Geometry extends GeometryTester {

    public static double circle(double radius) {
        return radius * radius * Math.PI;
    }

    public static double rectangle(double height, double width) {
        return height * width;
    }

    public static double triangle(double height, double width) {
        return height * width * 0.5;
    }
}
