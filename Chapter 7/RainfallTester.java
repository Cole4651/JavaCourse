import java.util.Scanner;

public class RainfallTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            Rainfall rain = new Rainfall();

            for(int i = 0; i < 12; i++) {
                double rainfall;
                while(true) {
                    System.out.println("Rain fall for month " + (i+1) + ": ");
                    try {
                        rainfall = input.nextDouble();
                        if(rainfall >= 0) {
                            break;
                        } else {
                            System.out.println("Invalid Answer. Try again");
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid Answer. Try again");
                        input.nextLine();
                    }
                }

                rain.addMonth(rainfall, i);
            }

            System.out.println("Total rainfall for the year: " + rain.totalRainfall());
            System.out.println("Average monthly rainfall: " + rain.average());
            System.out.println("Month with the most rain: " + rain.getMostRain());
            System.out.println("Month with the least rain: " + rain.getLeastRain());



            System.out.println("Would you like to test again? ");
            input.nextLine();
            String option = input.nextLine();
            if(option.equals("no")) {
                break;
            }
        }

    }
}
