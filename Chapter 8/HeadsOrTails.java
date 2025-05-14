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
                if(players >= 2) {
                    break;
                }
                System.out.println("Invalid input, try again. \n");
            }

            int winner = -1;
            int[] scores = new int[players];
            for(int i = 0; i < players;i++) {
                scores[i] = 0;
            }

            while(true) {
                coin.toss();

                String roll = coin.getSideUp();
                System.out.println(roll);

                for(int i = 0; i < players; i++) {
                    System.out.println("Player " + (i+1) + "'s' turn. ");
                    String choice;


                    while(true) {
                        System.out.println("Enter heads or tails: ");
                        choice = input.nextLine();
                        if(choice.equals("heads") || choice.equals("tails")) {
                            break;
                        }
                        System.out.println("Try again. ");
                    }

                    if(choice.equals(roll)) {
                        scores[i] = scores[i] + 1;
                        
                    } else {
                        scores[i]--;
                    }
                }

                for(int j = 0; j < scores.length; j++) {
                    if(scores[j] == 5) {
                        winner = j;
                    }
                    System.out.println(scores[j]);
                }
                if(winner != -1) {
                    break;
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
