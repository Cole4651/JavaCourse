import java.util.Scanner;

public class MonthTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a month number: ");
            int num1 = input.nextInt();
            Month month1 = new Month(num1);
            System.out.println("Enter a month Name: ");
            input.nextLine();
            String monthName = input.nextLine();
            Month month2 = new Month(monthName);

            System.out.println();

            System.out.println("Month number to month name: " + num1 + " --> " + month1.getMonthName() + ". ");
            System.out.println("Month name to month number: " + monthName + " --> " + month2.getMonthNumber() + ". ");

            System.out.println("Month 1 equals Month 2: " + month1.equals(month2));
            System.out.println("Month 1 is greater than Month 2: " + month1.greaterThan(month2));
            System.out.println("Month 1 is less than Month 2: " + month1.lessThan(month2));
            System.out.println("Both Months: " + month1 + " | " + month2);






            System.out.println();
            System.out.println("Would you like to test again? ");
            String option = input.nextLine();
            if(option.equals("no")) {
                break;
            }
        }
    }
}
