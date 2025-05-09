import java.util.Scanner;

public class AreaTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            int choice;
            
            while(true){
                System.out.println("Which would you like to calculate the area of: \n1.) Circle \n2.) Rectangle \n3.) Cylinder");
                choice = input.nextInt();

                if(choice == 1 || choice == 2 || choice ==3) {
                    break;
                }
                System.out.println("Invalid option, pick 1, 2, or 3. ");
            }
            
            System.out.println("Negative Values converted to positives values automatically.");
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter radius: ");
                    double radius = input.nextDouble();
                    Area.area(radius);
                }
                case 2 -> { 
                    System.out.println("Enter width: ");
                    double width = input.nextDouble();
                    System.out.println("Enter height: ");
                    double height = input.nextDouble();
                    Area.area(width, height);
                }
                default -> {
                    System.out.println("Enter radius: ");
                    double cylinderRadius = input.nextDouble();
                    System.out.println("Enter height: ");
                    double cylinderHeight = input.nextDouble();
                    Area.area("cylinder" ,cylinderRadius, cylinderHeight);
                }

            }


            System.out.println();
            System.out.println("Would you like to test again? ");
            input.nextLine();
            String option = input.nextLine();
            if(option.equals("no")) {
                break;
            }
        }
    }

}
