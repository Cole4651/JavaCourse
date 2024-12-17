import java.util.Scanner;

public class FallingDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            for(int i = 1; i < 11; i++) {
                double distance = getDistance(i);

                System.out.print("The object falls ");
                System.out.printf("%5.2f", distance);
                System.out.println(" meters in " + i + " seconds. ");
            }
            
            System.out.println();
            System.out.println("Would you like to test again? ");
            String option = input.nextLine();
            if(option.equals("no")) {
                break;
            }
        }
    }
            
    private static double getDistance(int time) {

        double distance = 0.5 * 9.8 * time * time;

        return distance;
    }
}
