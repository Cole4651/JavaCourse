import java.util.Scanner;


public class Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) { 

            System.out.println("1. Convert to kilometers");
            System.out.println("2. Convert to inches");
            System.out.println("3. Convert to feet");
            System.out.println("4. Quit");
            System.out.println();
            System.out.println("Enter choice: ");
            int conversion = input.nextInt();
            System.out.println();

            if(conversion == 4) {
                break;
            }

            System.out.println("Enter a distance in meters: ");
            double meters = input.nextDouble();
            System.out.println();
            
            switch (conversion) {
                case 1 -> System.out.println(meters + " meters is " + showKilo(meters) + " kilometers");
                case 2 -> System.out.println(meters + " meters is " + showInches(meters) + " inches");
                case 3 -> System.out.println(meters + "meters is " + showFeet(meters) + " feet");
            }
            System.out.println();
        }
    }

    public static double showKilo(double num) {
        return rounded(num * 0.001);
    }

    public static double showInches(double num) {
        return rounded(num * 39.37);
    }

    public static double showFeet(double num) {
        return rounded(num * 3.281);
    }

    public static double rounded(double num) {
        num = num * 1000;
        num = Math.round(num);
        num = num / 1000;
        return num;
    }
}
