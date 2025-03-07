import java.util.Scanner;

public class CircleTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Enter radius: ");
            double radius = 0;
            while(true) {
                radius = input.nextDouble();
                if(radius >= 0) {
                    break;
                }
                System.out.println("Invalid answer, try again. ");
            }

            Circle circle = new Circle(radius);
            System.out.println("Area: " + circle.getArea());
            System.out.println("Diameter: " + circle.getDiameter());
            System.out.println("Circumference: " + circle.getCircumference());

            input.nextLine();
            System.out.println("Would you like to test again? ");
            String choice = input.nextLine();
            if(choice.equals("no")) {
                break;
            }
        }
    }
}
