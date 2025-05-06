import java.util.Scanner;

public class PlayerTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        while(true) {
            System.out.println("Game to one");
            int players;

            while(true) {
                System.out.println("How many players? ");
                players = input.nextInt();
                if(players >= 1) {
                    break;
                }
                System.out.println("Invalid input, try again. \n");
            }

            int temp = 0;
            int winner = 0;
            for(int i = 0; i < players; i++) {
                Player player = new Player();
                System.out.println();
                System.out.println("Player " + (i+1) + "'s turn");
                int count = 0;
                while(true) {
                    count++;
                    player.roll();
                    System.out.println("Your score is " + player.getScore());
                    if(player.getScore() == 1) {
                        if(i == 0) {
                            temp = count;
                        } else {
                            if (temp > count) {
                                winner = i;
                            }
                        }
                        break;
                    }
                }
            }

            System.out.println("Player " + (winner+1) + " won and took " + temp + " rolls to get one. ");


            input.nextLine();
            System.out.println();
            System.out.println("Would you like to test again? ");
            String option = input.nextLine();
            if(option.equals("no")) {
                break;
            }
        }
    }
}
