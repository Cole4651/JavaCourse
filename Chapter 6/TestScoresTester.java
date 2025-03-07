import java.util.Scanner;

public class TestScoresTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            TestScores user = new TestScores();

            System.out.println("Test Score 1: ");
            double testOne = user.testScore();

            System.out.println("Test Score 2: ");
            double testTwo = user.testScore();

            System.out.println("Test Score 3: ");
            double testThree = user.testScore();

            user.setTestOne(testOne);
            user.setTestTwo(testTwo);
            user.setTestThree(testThree);
            
            System.out.println("Average: " + user.average());

            System.out.println("Would you like to test again? ");
            String choice = input.nextLine();
            if(choice.equals("no")) {
                break;
            }
        }
    }
}
