// 3.6
import java.util.Scanner;

public class TimeCalculator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount of seconds: ");
        int seconds = input.nextInt();

        if(seconds >= 86400)
        {
            int days = seconds / 86400;
            int hours = (seconds % 86400) / 3600;
            int minutes = ((seconds % 86400) % 3600) / 60;
            int second = ((seconds % 86400) % 3600) % 60;
            System.out.println(days + " day(s), " + hours + " hours, " + minutes + " minutes, and " + second + " seconds in " + seconds + " seconds. ");
        }
        else if (seconds >= 3600)
        {
            int hours = (seconds % 86400) / 3600;
            int minutes = ((seconds % 86400) % 3600) / 60;
            int second = ((seconds % 86400) % 3600) % 60;
            System.out.println(hours + " hours, " + minutes + " minutes, and " + second + " seconds in " + seconds + " seconds. ");
        }
        else if (seconds >= 60)
        {
            int minutes = ((seconds % 86400) % 3600) / 60;
            int second = ((seconds % 86400) % 3600) % 60;
            System.out.println(minutes + " minutes and " + second + " seconds in " + seconds + " seconds. ");
        }
        else
        {
            System.out.println(seconds + " second(s) ");
        }
        input.close();
    }
}
