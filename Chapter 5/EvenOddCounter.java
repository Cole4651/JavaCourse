import java.util.Random;
import java.util.Scanner;

public class EvenOddCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        while(true){
            int evenCount = 0;
            int oddCount = 0;
            for(int i = 0; i < 100; i++) {
                int x = random.nextInt();
                if(isEven(x)) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            System.out.println("Number of even numbers: " + evenCount);
            System.out.println("Number of odd numbers: " + oddCount);

            System.out.println();
            System.out.println("Would you like to test again? ");
            String option = input.nextLine();
            if(option.equals("no")) {
                break;
            }
        }
    }


    private static boolean isEven(int num) {
        return (num % 2) == 0;
    }
}
