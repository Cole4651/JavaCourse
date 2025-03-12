import java.util.Scanner;

public class GradeBookTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            GradeBook gradebook = new GradeBook();
            for(int i = 0; i < 5; i++){
                System.out.println("Enter Student " + (i+1) + ": ");
                String name = input.nextLine();
                gradebook.setName(name, i);

                for(int j = 0; j < 4; j++) {
                    while(true) { 
                        System.out.println("Enter Test Score " + (j+1) + ": ");
                        double score = input.nextDouble();
                        if(score >= 0 && score <= 100) {
                            gradebook.setScore(score, i, j);
                            break;
                        } else {
                            System.out.println("Invalid Score, Try Again. ");
                        }
                    }
                }
                input.nextLine();
                double average = gradebook.average(i);
                gradebook.setLetterGrade(average, i);
                System.out.println();
            }

            for(int i = 0; i < 5; i++) {
                System.out.println("Student name: " + gradebook.getName(i));
                System.out.println("Average test score: " + gradebook.average(i));
                System.out.println("Letter Grade: " + gradebook.getLetterGrade(i));
                System.out.println();
            }


            System.out.println();
            System.out.println("Would you like to test again? ");
            String option = input.nextLine();
            if(option.equals("no")) {
                break;
            }
        }
    }
}
