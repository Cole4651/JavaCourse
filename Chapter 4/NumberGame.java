
import java.util.Random;
import java.util.Scanner;


public class NumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Random randomNum = new Random();
        while(true) {
            int num = randomNum.nextInt();
            System.out.println(num);

            int count = 0;
            while(true){
                count += 1;
                int guess = 0;
                System.out.println("Enter your guess: ");
                guess = input.nextInt();

                if(guess == num){
                    break;
                } else if (guess < num) {
                    System.out.println("The number is higher. ");
                } else {
                    System.out.println("The number is lower. ");
                }
                System.out.println();
            }
            System.out.println("It took you " + count + " guesses. ");
            input.nextLine();
            System.out.println();
            System.out.println("Would you like to play again? ");
            String option = input.nextLine();
            if(!option.equals("yes")) {
                break;
            }
        }
    }
}
