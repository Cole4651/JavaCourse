// 3.2
import java.util.Scanner;

public class MagicDates 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month in numeric format: ");
        int month = input.nextInt();
        
        System.out.println("Enter a day: ");
        int day = input.nextInt();
        
        System.out.println("Enter a two digit year: ");
        int year = input.nextInt();
        
        System.out.println();
        System.out.print(month + "/" + day + "/" + year);
        
        if((month * day) == year)
        {
            System.out.println(" is a magic date. \n");
        }
        else
        {
            System.out.println(" is not a magic date. \n");
        }

        input.close();
    }
}
