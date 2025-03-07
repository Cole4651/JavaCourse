import java.util.Scanner;

public class MonthDaysTester {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a month (1-12): ");
            int month = 0;
            while(true) {
                month = input.nextInt();
                if(month > 0 && month <=12 ) {
                    break;
                }
                System.out.println("Invalid answer, try again. ");
            }

            System.out.println("Enter a year: ");
            int year = 0;
            while(true) {
                year = input.nextInt();
                if(year >= 0) {
                    break;
                }
                System.out.println("Invalid answer, try again.");
            }

            MonthDays test = new MonthDays(month, year);
            System.out.println(test.getNumberOfDays() + " days");

            input.nextLine();
            System.out.println();
            System.out.println("Would you like to test again? ");
            String option = input.nextLine();
            if(option.equals("no")) {
                break;
            }
        }
    }
}
