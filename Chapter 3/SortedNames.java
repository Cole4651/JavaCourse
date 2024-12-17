// 3.7
import java.util.Scanner;

public class SortedNames 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String nameOne = input.nextLine();

        System.out.println("Enter another name: ");
        String nameTwo = input.nextLine();

        System.out.println("Enter another name: ");
        String nameThree = input.nextLine();

        System.out.println();

        if(nameOne.compareTo(nameTwo) <= 0)
        {
            if(nameOne.compareTo(nameThree) <= 0)
            {
                System.out.println(nameOne);
                if(nameTwo.compareTo(nameThree) <= 0)
                {
                    System.out.println(nameTwo);
                    System.out.println(nameThree);
                }
                else
                {
                    System.out.println(nameThree);
                    System.out.println(nameTwo);
                }
            }
            else
            {
                System.out.println(nameThree);
                System.out.println(nameOne);
                System.out.println(nameTwo);
            }
                
        }
        else if(nameTwo.compareTo(nameOne) <= 0)
        {
            if(nameTwo.compareTo(nameThree) <= 0)
            {
                System.out.println(nameTwo);
                if(nameOne.compareTo(nameThree) <= 0)
                {
                    System.out.println(nameOne);
                    System.out.println(nameThree);
                }
                else
                {
                    System.out.println(nameThree);
                    System.out.println(nameOne);
                }
            }
            else
            {
                System.out.println(nameThree);
                System.out.println(nameTwo);
                System.out.println(nameOne);
            }
                
        }
        else if(nameThree.compareTo(nameOne) <= 0)
        {
            if(nameThree.compareTo(nameTwo) <= 0)
            {
                System.out.println(nameThree);
                if(nameOne.compareTo(nameTwo) <= 0)
                {
                    System.out.println(nameOne);
                    System.out.println(nameTwo);
                }
                else
                {
                    System.out.println(nameTwo);
                    System.out.println(nameOne);
                }
            }
            else
            {
                System.out.println(nameTwo);
                System.out.println(nameThree);
                System.out.println(nameOne);
            }
            
        }

        input.close();
    }
}
