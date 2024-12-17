//2.10
import java.util.Scanner;

public class TestAvg
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
        
        input.close();
    }    
}
