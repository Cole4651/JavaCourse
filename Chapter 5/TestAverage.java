import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true) {
            System.out.println("Enter test 1: ");
            double score1 = input.nextDouble();
            System.out.println("Letter Grade: " + determineGrade(score1));
            System.out.println();

            System.out.println("Enter test 2: ");
            double score2 = input.nextDouble();
            System.out.println("Letter Grade: " + determineGrade(score2));
            System.out.println();

            System.out.println("Enter test 3: ");
            double score3 = input.nextDouble();
            System.out.println("Letter Grade: " + determineGrade(score3));
            System.out.println();

            System.out.println("Enter test 4: ");
            double score4 = input.nextDouble();
            System.out.println("Letter Grade: " + determineGrade(score4));
            System.out.println();

            System.out.println("Enter test 5: ");
            double score5 = input.nextDouble();
            System.out.println("Letter Grade: " + determineGrade(score5));
            System.out.println();

            System.out.println("Average test score is " + calcAverage(score1, score2, score3, score4, score5));
        
            System.out.println();
            System.out.println("Would you like to test again? ");
            input.nextLine();
            String option = input.nextLine();
            if(option.equals("no")) {
                break;
            }
        }
    }

    private static char determineGrade(double x) {
        char grade;
        if(89 < x)
        {
            grade = 'A';
        }
        else if(79 < x)
        {
            grade = 'B';
        }
        else if(69 < x)
        {
            grade = 'C';
        }
        else if(59 < x)
        {
            grade = 'D';
        }
        else
        {
            grade = 'F';
        }

        return grade;
    }

    private static double calcAverage(double a, double b, double c, double d, double e) {
        double average = (a + b + c + d + e) / 5.0 * 100;
        average = Math.round(average);
        average /= 100;
        return average;
    }
}
