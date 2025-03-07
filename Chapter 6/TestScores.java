import java.util.Scanner;

public class TestScores {
    private double testOne;
    private double testTwo;
    private double testThree;

    public TestScores() {
        testOne = 0;
        testTwo = 0;
        testThree = 0;
    }

    public double average() {
        double sum = testOne + testTwo + testThree;
        double average = sum / 3 * 100;
        average = Math.round(average);

        return average / 100;
    }

    public double getTestOne() {
        return testOne;
    }

    public void setTestOne(double testOne) {
        this.testOne = testOne;
    }

    public double getTestTwo() {
        return testTwo;
    }

    public void setTestTwo(double testTwo) {
        this.testTwo = testTwo;
    }

    public double getTestThree() {
        return testThree;
    }

    public void setTestThree(double testThree) {
        this.testThree = testThree;
    }

    public double testScore(){
        Scanner input = new Scanner(System.in);
        while(true) {
            double test = input.nextFloat();
            if(test >=0 && test <= 100) {
                return test;
            }
            System.out.println("Invalid answer, try again.");
        }
    }
    
}
