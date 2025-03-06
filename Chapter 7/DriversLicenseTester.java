import java.util.Scanner;

public class DriversLicenseTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            String[] studentTest = new String[20];

            for(int i = 0; i < 20; i++) {
                while (true) { 
                    System.out.println("Question " + (i+1) + ": ");
                    studentTest[i] = input.nextLine();
                    if(studentTest[i].equals("A") || studentTest[i].equals("B") || studentTest[i].equals("C") ||studentTest[i].equals("D")) {
                        break;
                    } else {
                        System.out.println("Invalid Answer. Try again. ");
                    }
                }
            }



            DriversLicense student = new DriversLicense(studentTest);
            student.incorrect();

            System.out.println("Correct Answers " + student.totalCorrect());
            System.out.println("Incorrect Answers " + student.totalIncorrect());

            if(student.passed()) {
                System.out.println("The student passed. ");
            } else {
                System.out.println("The student didn't pass. ");
            }
            
            System.out.println("Questions missed: ");
            if(student.questionsMissed().isEmpty()) {
                System.out.println("None");
            } else {
                for (int i = 0; i < student.questionsMissed().size(); i++) {
                    System.out.println(student.questionsMissed().get(i));
                }
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
