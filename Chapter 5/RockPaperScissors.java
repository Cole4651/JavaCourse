import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        while(true) {
            String winner = null;
            while(true) {

                int computer = random.nextInt(1, 4); 

                int user = 0;
                while(true) {
                    System.out.println("Enter rock(1), paper(2), or scissors(3): ");
                    user = input.nextInt();
                    if(user >= 1 && user <= 3) {
                        break;
                    }
                    System.out.println("Invalid Answer. Try Again.");
                }
                input.nextLine();
                switch (computer) {
                    case 1 -> System.out.println("Computer chose rock");
                    case 2 -> System.out.println("Computer chose paper");
                    default -> System.out.println("Computer chose scissors");
                }
                System.out.println();

                winner = winner(computer, user);

                if (!winner.equals("tie")) {
                    break;
                }
                System.out.println("It was a tie"); 
            }

            System.out.println(winner + " won");

            System.out.println();
            System.out.println("Would you like to test again? ");
            String option = input.nextLine();
            if(option.equals("no")) {
                break;
            }
        }
    }


    private static String winner(int computer, int user) {
        if(computer  == 1 && user == 3 || computer == 2 && user == 1 || computer == 3 && user == 2) {
            return "Computer";
        } else if (computer == user) {
            return "tie";
        } else {
            return "User";
        }
    }
}
