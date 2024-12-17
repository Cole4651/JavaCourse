import java.util.Scanner;

public class SumNumbers 
{
    public static void main(String[] args) 
    {
      Scanner input = new Scanner(System.in);
      while(true) {

        System.out.println("Enter a positive nonzero integer value: ");
        int num = input.nextInt();

        int sum = 0;

        for(int i = 1; i <= num; i++)
        {
          sum = sum + i;
        }
        System.out.println("The sum of all the integers from 1 up to " + num + " is " + sum + ". ");
        
        System.out.println();
        System.out.println("Would you like to play again? ");
        String option = input.nextLine();
        if(option.equals("no")) {
            break;
        }
      }
    }
}