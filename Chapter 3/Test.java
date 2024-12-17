// 3.4
import java.util.Scanner;

public class Test 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your first test score? ");
        double testOne = input.nextDouble();

        System.out.println("What is your second test score? ");
        double testTwo = input.nextDouble();

        System.out.println("What is your third test score? ");
        double testThree = input.nextDouble();

        System.out.println("Test Scores: " + testOne + ", " + testTwo + ", " + testThree);


        double avg = (testOne + testTwo + testThree) / 3;
        avg = Math.round(avg *100);
        avg = avg / 100;
        System.out.println("Average: " + avg);

        if(89 < avg)
        {
            System.out.println("Grade letter: A");
        }
        else if(79 < avg)
        {
            System.out.println("Grade letter: B");
        }
        else if(69 < avg)
        {
            System.out.println("Grade letter: C");
        }
        else if(59 < avg)
        {
            System.out.println("Grade letter: D");
        }
        else if(0 <= avg)
        {
            System.out.println("Grade letter: F");
        }
        else
        {
            System.out.println("You got a wierd score. ");
        }
        
        input.close();
    }
}
