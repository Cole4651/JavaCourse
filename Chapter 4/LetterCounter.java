import java.util.Scanner;

public class LetterCounter 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.println("Enter a string: ");
            String word = input.nextLine();

            System.out.println("Enter a character: ");
            char character = input.next().charAt(0);


            int count = 0;
            for(int i = 0; i < word.length(); i ++)
            {
                if(word.charAt(i) == character)
                {
                    count++;
                }
                
            }
            System.out.println("The character '" + character + "' appears in the word '" + word + "' " + count + " time(s). ");
            
            input.nextLine();
            System.out.println();
            System.out.println("Would you like to play again? ");
            String option = input.nextLine();
            if(!option.equals("yes")) {
                break;
            }
        }
        input.close();
    }
}