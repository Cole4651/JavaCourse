public class TestScores {
    private int testOne;
    private int testTwo;
    private int testThree;

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

    public int getTestOne() {
        return testOne;
    }

    public void setTestOne(int testOne) {
        this.testOne = testOne;
    }

    public int getTestTwo() {
        return testTwo;
    }

    public void setTestTwo(int testTwo) {
        this.testTwo = testTwo;
    }

    public int getTestThree() {
        return testThree;
    }

    public void setTestThree(int testThree) {
        this.testThree = testThree;
    }

    
}
