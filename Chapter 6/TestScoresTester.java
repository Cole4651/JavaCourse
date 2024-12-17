import java.util.Scanner;

public class TestScoresTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Test Score 1: ");
        int testOne = input.nextInt();

        System.out.println("Test Score 2: ");
        int testTwo = input.nextInt();

        System.out.println("Test Score 3: ");
        int testThree = input.nextInt();

        TestScores user = new TestScores();
        user.setTestOne(testOne);
        user.setTestTwo(testTwo);
        user.setTestThree(testThree);
        
        System.out.println("Average: " + user.average());

    }
}
