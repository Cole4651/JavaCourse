// 3.1
import java.util.Scanner;

public class RomanNumerals 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
    
        int num = 0;

        while(true)
        {
            System.out.println("Enter a number between 1 and 10");
            num = input.nextInt();

            if (num > 0 && num < 11)
            {
                break;
            }
            else
            {
                System.out.println("Wrong number. Try again. ");
            }
        }

        String romanNum = "";
            for(int i = 1; i <= num; i++)
            {   
                romanNum = romanNum + "I";
            switch (i) {
                case 4 -> romanNum = "IV";
                case 5 -> romanNum = "V";
                case 9 -> romanNum = "IX";
                case 10 -> romanNum = "X";
                default -> {
                }
            }
            }

            System.out.println("The roman numeral is " + romanNum);

            input.close();
    }    
}
