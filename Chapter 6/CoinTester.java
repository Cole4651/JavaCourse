import java.util.Scanner;

public class CoinTester {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) { 

            Coin coin = new Coin();

            int tails = 0; 
            int heads = 0;
            for(int i = 0; i < 20; i ++) {
                coin.toss();
                System.out.println("Toss " + (i+1) + ": " + coin.getSideUp());
                if(coin.getSideUp() == "tails") {
                    tails ++;
                } else {
                    heads++;
                }
            }

            System.out.println();
            System.out.println("Number of heads facing up: " + heads);
            System.out.println("Number of tails facing up: " + tails);
            System.out.println();

            System.out.println("Would you like to test again? ");
            String option = input.nextLine();
            if(option.equals("no")) {
                break;
            }
        }
    }
}
