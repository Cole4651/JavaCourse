import java.util.Scanner;

public class KineticEnergy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) { 
            System.out.println("Enter the mass of the object in kilograms: ");
            double mass = input.nextDouble();

            System.out.println("Enter the velocity of the object in meters per second: ");
            double velocity = input.nextDouble();
            input.nextLine();

            double kineticEnergy = kineticEnergy(mass, velocity);
            System.out.println("The kinetic energy of the object is " + kineticEnergy);

            System.out.println("Would you like to enter more values? ");
            String option = input.nextLine();

            if(option.equals("no")) {
                break;
            }

        }
    }

    private static double kineticEnergy(double mass, double velocity) {
        double kineticEnergy = 0.5 * mass * velocity * velocity;
        return kineticEnergy;
    }
}
