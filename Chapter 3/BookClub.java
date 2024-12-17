// 3.16
import java.util.Scanner;

public class BookClub 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("How many books did you purchase this month? ");
        int books = input.nextInt();

        if(books == 0)
        {
            System.out.println("You earn 0 points. ");
        }
        else if(books == 1)
        {
            System.out.println("You earn 5 points. ");
        }
        else if(books == 2)
        {
            System.out.println("You earn 15 points. ");
        }
        else if(books == 3)
        {
            System.out.println("You earn 30 points. ");
        }
        else if(books >= 4)
        {
            System.out.println("You earn 60 points. ");
        }
        else
        {
            System.out.println("Invalid Answer. ");
        }

        input.close();
    }
}
