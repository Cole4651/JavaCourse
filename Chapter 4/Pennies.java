// 4.4

import java.util.Scanner;

public class Pennies 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        while(true) {
            int days = 0;
            while(true)
            {
                System.out.println("Enter a day that is more than or equal to 1: ");
                days = input.nextInt();

                if(days >= 1)
                {
                    break;
                }
                System.out.println("Invalid answer. ");
                System.out.println();

            }

            for(double i = 0; i < days; i++)
            {

                double salary = Math.pow(2, i) / 100;
                System.out.println("Salary for day " + (i+1) + " is $" + salary + ". ");
            }
            
            input.nextLine();
            System.out.println();
            System.out.println("Would you like to go again? ");
            String option = input.nextLine();
            if(option.equals("no")) {
                break;
            }
        }
    }

}