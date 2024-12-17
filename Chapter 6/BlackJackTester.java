
import java.util.Scanner;

public class BlackJackTester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {

            int userTotal = 0;
            int computerTotal = 0;

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
                    }
                }

            }

            System.out.println("Would you like to test again? ");
            String option = input.nextLine();
            if(option.equals("no")) {
                break;
            }
        }
    }
}
