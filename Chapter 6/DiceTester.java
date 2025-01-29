import java.util.Scanner;

public class DiceTester {
    public static void main(String[] args) {
        while (true) { 
            Scanner input = new Scanner(System.in);

            Dice user = new Dice();
            Dice comp = new Dice();

            int userScore = 0;
            int compScore = 0;
            for(int i = 0; i < 10; i ++) {
                user.rollDice();
                comp.rollDice();
                System.out.println("User's roll: " + user.getScore());
                System.out.println("Computer's roll: " + comp.getScore());
                if(user.getScore() > comp.getScore()) {
                    userScore++;
                    System.out.println("The user's roll was higher. ");
                } else if (user.getScore() < comp.getScore()) {
                    compScore++;
                    System.out.println("The computer's roll was higher. ");
                } else {
                    System.out.println("It was a tie");
                }
            }

            System.out.println();
            System.out.println("Final Score: ");
            System.out.println("User's score: " + userScore);
            System.out.println("Computer's score: " + compScore);
            System.out.println();


            if(userScore == compScore) {
                System.out.println("There is no grand winner. ");
            } else if (userScore > compScore) {
                System.out.println("The user is the grand winner. ");
            } else {
                System.out.println("The computer is the grand winner. ");
            }

            System.out.println("Would you like to test again? ");
            String option = input.nextLine();
            if(option.equals("no")) {
                break;
            }
        }
        
    }
}
