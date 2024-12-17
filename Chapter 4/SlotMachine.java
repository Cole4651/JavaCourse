import java.util.Random;
import java.util.Scanner;


public class SlotMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        
        while(true) {
            System.out.println("Enter the amount of money you would like to play: ");
            int money = input.nextInt();
            input.nextLine();

            System.out.println();

            int cherries = 0;
            int oranges = 0;
            int plums = 0;
            int bells = 0;
            int melon = 0;
            int bar = 0;

            for(int i = 0; i < 3; i++) {
                int image = random.nextInt(0,5);
                System.out.print("");
                switch (image) {
                    case 0 -> {
                        System.out.print("Cherries ");
                        cherries++;
                    }
                    case 1 -> {
                        System.out.print("Oranges ");
                        oranges++;
                    }
                    case 2 -> {
                        System.out.print("Plums ");
                        plums++;
                    }
                    case 3 -> {
                        System.out.print("Bells ");
                        bells++;
                    }
                    case 4 -> {
                        System.out.print("Melons ");
                        melon++;
                    }
                    default -> {
                        System.out.print("Bars ");
                        bar++;
                    }
                }
            }

            System.out.println("\n");

            if(cherries == 2 || oranges == 2 || plums == 2 || bells == 2 || melon == 2 || bar == 2) {
                money *= 2;
            } else if (cherries == 3 || oranges == 3 || plums == 3 || bells == 3 || melon == 3 || bar == 3){
                money *= 3;
            } else { 
                money = 0;
            }

            System.out.println("Your new money amount is " + money);

            System.out.println();
            System.out.println("Would you like to play again? ");
            String option = input.nextLine();
            if(option.equals("no")) {
                break;
            }
        }
    }
}
