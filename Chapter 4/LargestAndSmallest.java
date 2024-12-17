import java.util.Scanner;

public class LargestAndSmallest 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) { 

            int num = 0;
            int large = 0;
            int small = 0;

            while(true)
            {
                System.out.println("Enter an integer: ");
                num = input.nextInt();
                if(num == -99) {
                    break;
                }
                if(num > large)
                {
                    large = num;
                }
                if(num < small)
                {
                    small = num;
                }
            }
            System.out.println();
            System.out.println("Largest number: " + large);
            System.out.println("Smallest number: " + small);

            input.nextLine();
            System.out.println();
            System.out.println("Would you like to play again? ");
            String option = input.nextLine();
            if(!option.equals("yes")) {
                break;
            }
        }
        input.close();
    }
}
