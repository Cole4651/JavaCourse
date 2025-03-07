
import java.util.Scanner;

public class BlackJackTester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userTotal = 0;

        while(userTotal <= 21) {
            BlackJack user = new BlackJack();
            BlackJack computer = new BlackJack();

            for(int i = 0; i < 2; i++) {
                user.addScore();
                computer.addScore();
            }

            while (true) { 
                System.out.println("Your total: " + user.getScore());
                System.out.println("Would you like to hit?");
                String hit = input.nextLine();
                if(hit.equals("yes")) {
                    user.addScore();
                } else if (hit.equals("no")) {
                    break;
                } else {
                    System.out.println("Invalid answer, try again. ");
                }

                if(user.getScore() > 21) {
                    System.out.println("Your total: " + user.getScore());
                    System.out.println("You busted.");
                    break;
                }
            }
            System.out.println();
            while(true) {
                System.out.println("The computer has " + computer.getScore());
                if(computer.getScore() <= 15) {
                    System.out.println("Computer decides to hit. ");
                    computer.addScore();
                } else {
                    System.out.println("Computer decides to stay. ");
                    break;
                }
            }

            System.out.println();
            System.out.println(winner(user, computer) + " wins");

            System.out.println("Would you like to test again? ");
            String option = input.nextLine();
            if(option.equals("no")) {
                break;
            }
        }
    }

    public static String winner(BlackJack user, BlackJack computer) {
        if(user.getScore() > computer.getScore() && user.getScore() <= 21) {
            return "User";
        }
        return "Computer";
    }
}
