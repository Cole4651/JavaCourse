// 2.18
import java.util.Scanner;

public class WordGame 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = input.nextLine();

        System.out.println("What is your age? ");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("What is a name of a city? ");
        String city = input.nextLine();

        System.out.println("What is a name of a college? ");
        String college = input.nextLine();

        System.out.println("What is a profession? ");
        String profession = input.nextLine();

        System.out.println("What is a type of animal? ");
        String animal = input.nextLine();

        System.out.println("What is a pet's name? ");
        String petName = input.nextLine();

        System.out.println();
        System.out.println("There once was a person named " + name + " who lived in " + city + ". At the age of " + age + ", " + name + " went to college at " + college + ". " + name + " graduated and went to work as a " + profession + ". Then, " + name + " adopted a(n) " + animal + " named " + petName + ". They both lived happily ever after! ");

        input.close();
    }    
}
