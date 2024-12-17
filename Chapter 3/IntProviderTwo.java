// 3.14
import java.util.Scanner;

public class IntProviderTwo 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Which package did you have? ");
        System.out.println("Package A: For $9.95 per month 10 hours of access are provided. Additional hours are $2.00 per hour. ");
        System.out.println("Package B: For $13.95 per month 20 hours of access are provided. Additional hours are $1.00 per hour. ");
        System.out.println("Package C: For $19.95 per month unlimited access are provided. ");

        String pack = input.nextLine();

        System.out.println("How many hours did you use? ");
        int hours = input.nextInt();

        double billA = 9.95;
        if(hours > 10)
        {
            billA = billA + 2 * (hours - 10);
        }

        double billB = 13.95;
        if (hours > 20)
        {
            billB = billB + (hours - 20);
        }

        double billC = 19.95;

        switch (pack) {
            case "A" -> {
                System.out.println("Your bill is $" + billA);
                if(billB < billA)
                {
                    System.out.print("Package B would have saved you $");
                    double saveB = billA-billB;
                    System.out.format("%.2f", saveB);
                }   if(billC < billA)
                {
                    System.out.println();
                    System.out.print("Package C would have saved you $");
                    double saveC = billA-billC;
                    System.out.format("%.2f", saveC);
                }
            }
            case "B" -> {
                System.out.println("Your bill is $" + billB);
                if(billA < billB)
                {
                    System.out.print("Package A would have saved you $");
                    double saveA = billB-billA;
                    System.out.format("%.2f", saveA);
                }   if(billC < billB)
                {
                    System.out.println();
                    System.out.print("Package C would have saved you $");
                    double saveC = billB-billC;
                    System.out.format("%.2f", saveC);
                }
            }
            case "C" -> {
                System.out.println("Your bill is $" + billC);
                if(billA < billC)
                {
                    System.out.print("Package A would have saved you $");
                    double saveA = billC-billA;
                    System.out.format("%.2f", saveA);
                }   if(billB < billC)
                {
                    System.out.println();
                    System.out.print("Package B would have saved you $");
                    double saveB = billC-billB;
                    System.out.format("%.2f", saveB);
                }
            }
            default -> System.out.println("Invalid Package. ");
        }


    }
}
