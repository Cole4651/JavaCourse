//2.12
import java.util.Scanner;

public class StringManipulator
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("\nWhat is your favorite city? ");
        String city = input.nextLine();

        int length = city.length();
        int count = 0;
        for(int i = 0; i < length; i++) {
            if(city.charAt(i) == ' '){
                count++;
            }
        }
        length -= count;


        System.out.println("\nNumber of characters in the city: " + length);
        System.out.println("Name of city in all uppercase letters: " + city.toUpperCase());
        System.out.println("Name of city in all lowercase letters: " + city.toLowerCase());
        System.out.println("First character in the name of the city: " + city.charAt(0));

        input.close();
    }
}
