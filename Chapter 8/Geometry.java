import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) { 
            int choice = 0;
            while(true) {
                System.out.println("Geometry Calculator ");
                System.out.println("1. Calculate area of a circle ");
                System.out.println("2. Calculate area of a rectangle ");
                System.out.println("3. Calculate area of a triangle ");
    
                choice = input.nextInt();
                if(choice >= 1 && choice <= 3) {
                    break;
                }
                System.out.println("Invalid input, try again. \n");
            }
            double area = 0;
            switch(choice) {
                case 1 -> {
                    System.out.println("Enter the radius: ");
                    double radius = input.nextDouble();
                    System.out.println("Area of circle: " + rounded(circle(radius)));
                }
                default -> {
                    System.out.println("Enter the base: ");
                    double base = input.nextDouble();
                    System.out.println("Enter the height: ");
                    double height = input.nextDouble();
                    
                    switch(choice) {
                        case 2 -> System.out.println("Area of rectangle: " + rounded(rectangle(height, base)));
                        default -> System.out.println("Area of triangle: " + rounded(triangle(height, base)));
                    }
                }
            }

            input.nextLine();
            System.out.println();
            System.out.println("Would you like to test again? ");
            String option = input.nextLine();
            if(option.equals("no")) {
                break;
            }

        }
    }

    public static double circle(double radius) {
        return radius * radius * Math.PI;
    }

    public static double rectangle(double height, double width) {
        return height * width;
    }

    public static double triangle(double height, double width) {
        return height * width * 0.5;
    }
    
    public static double rounded(double num) {
        num = Math.round(num * 100);
        return num / 100;
    }
}
