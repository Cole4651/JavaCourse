// 2.13
import java.util.Scanner;

public class RestaurantBill 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the charge for the meal: ");
        double charge = input.nextDouble();

        double tax = charge * 0.0675;
        tax = Math.round(tax * 100);
        tax = tax / 100;

        double tip = (charge + tax) * .20;
        tip = Math.round(tip * 100);
        tip = tip / 100;

        double totalBill = tax + charge + tip;

        System.out.println("The meal charge is $" + charge);
        System.out.println("The tax is $" + tax);
        System.out.println("The tip amount is $" + tip);
        System.out.println("The total bill is $" + totalBill);

        input.close();
    }
}
