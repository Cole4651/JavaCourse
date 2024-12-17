import java.util.Scanner;

public class SumNumbers 
{
    public static void main(String[] args) 
    {
      Scanner input = new Scanner(System.in);
      while(true) {
        int num = 0;
        
        while(true) {
          System.out.println("Enter a positive nonzero integer value: ");
          num = input.nextInt();
          if(num > 0) {
            break;
          }
          System.out.println("Invalid answer. ");
        }

        int sum = 0;

        for(int i = 1; i <= num; i++)
        {
          sum = sum + i;
        }
        System.out.println("The sum of all the integers from 1 up to " + num + " is " + sum + ". ");
        
        input.nextLine();
        System.out.println();
        System.out.println("Would you like to play again? ");
        String option = input.nextLine();
        if(option.equals("no")) {
            break;
        }
      }
    }
}