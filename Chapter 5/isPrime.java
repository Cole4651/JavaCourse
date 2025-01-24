import java.util.Scanner;

public class isPrime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            int num = 0;
            try {
                System.out.println("Enter an integer: ");
                num = input.nextInt();
                boolean isPrime = isPrime(num);
                if(isPrime) {
                    System.out.print("Your number is prime. ");
                } else {
                    System.out.println("Your number is not prime. ");
                }
            } catch (Exception e) {
                System.out.println("Invalid answer. ");
            }

            input.nextLine();
            System.out.println("Would you like to enter another value? ");
            String option = input.nextLine();
            if(option.equals("no")) {
                break;
            }
        }
    }

    private static boolean isPrime(int num) {
        boolean isPrime = true;

        if(num < 0) {
            return false;
        }

        for(int i = 2; i < num; i++) {
            int remainder = num % i;

            if(remainder == 0) {
                return false;
            }
        }

        return isPrime;
    }
}
