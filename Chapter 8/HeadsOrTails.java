import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        while (true) { 
            Coin coin = new Coin();

            int players;
            while(true) {
                System.out.println("How many players? ");
                players = input.nextInt();
                input.nextLine();
                if(players >= 1) {
                    break;
                }
                System.out.println("Invalid input, try again. \n");
            }

            int temp = 0;
            int winner = 0;
            for(int i = 0; i < players; i++) {
                System.out.println();
                int count = 0;
                int score = 0;
                while(true) {
                    String guess = "";
                    while(true) {
                        count++;
                        coin.toss();
                        System.out.println(coin.getSideUp());
                        System.out.println("Player " + (i+1) + ", heads or tails: ");
                        guess = input.nextLine();
                        if(guess.equals("heads") || guess.equals("tails")) {
                            break;
                        }
                        System.out.println("Invalid input, try again. \n");
                    }
                    if(guess.equals(coin.getSideUp())) {
                        score++;
                    } else {
                        score--;
                    }
                    System.out.println("It was " + coin.getSideUp());
                    System.out.println("Player " + (i+1) + "'s score is " + score);

                    if(score == 5) {
                        if(i == 0) {
                            temp = count;
                        } else {
                            if(count < temp) {
                                winner = i;
                            }
                        }
                        break;
                    }
                }
            }

            System.out.println("The winner is player " + (winner+1));
            System.out.println();


            System.out.println("Would you like to test again? ");
            String option = input.nextLine();
            if(option.equals("no")) {
                break;
            }
        }

    }
}
