import java.util.Scanner;

public class MonthDaysTester {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a month (1-12): ");
            int month = input.nextInt();
            System.out.println("Enter a year: ");
            int year = input.nextInt();

            MonthDays test = new MonthDays(month, year);
            System.out.println(test.getNumberOfDays());

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
