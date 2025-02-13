import java.util.Scanner;

public class AccountValidationTester {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            AccountValidation test = new AccountValidation();
            int num;
            while(true) {
                System.out.println("Enter a charge account number: ");
                try {
                    num = input.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid Input. Try again.");
                    input.nextLine();
                }
            }

            if(test.isValid(num)) {
                System.out.println("Valid charge account number. ");
            } else {
                System.out.println("Invalid charge account number. ");
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
