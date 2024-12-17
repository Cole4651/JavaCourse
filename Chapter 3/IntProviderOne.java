// 3.13
import java.util.Scanner;

public class IntProviderOne 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Which package did you have? ");
        System.out.println();
        System.out.println("Package A: For $9.95 per month 10 hours of access are provided. Additional hours are $2.00 per hour. ");
        System.out.println("Package B: For $13.95 per month 20 hours of access are provided. Additional hours are $1.00 per hour. ");
        System.out.println("Package C: For $19.95 per month unlimited access is provided. ");
        
        String pack = input.nextLine();

        System.out.println("How many hours did you use? ");
        int hours = input.nextInt();

        double monthlyBill = 0;
        switch (pack) {
            case "A" -> {
                if(hours > 10)
                {
                    monthlyBill = 9.95 + 2 * (hours - 10);
                }
                else
                {
                    monthlyBill = 9.95;
                }
            }
            case "B" -> {
                if(hours > 20)
                {
                    monthlyBill = 13.95 + (hours - 20);
                }
                else
                {
                    monthlyBill = 13.95;
                }
            }
            case "C" -> monthlyBill = 19.95;
            default -> System.out.println("Invalid answer. ");
        }
        System.out.println("Your monthly bill is $" + monthlyBill);

        input.close();
    }
}
