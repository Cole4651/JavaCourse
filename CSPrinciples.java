import java.util.Scanner;

// Compares rainfall of this year to U.S average rainfall
public class CSPrinciples {
    public static final double kansasAverageRainfall = 5.21;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creates array and fills with user data
        double[] array = new double[12];
        for(int i = 0; i < 12; i++) {
            System.out.println("Enter rainfall for month " + (i + 1) + ": ");
            double rain = input.nextDouble();
            array[i] = rain;
        }

        System.out.println(compareRain(array));


    }

    // Method that gets the average rainfall 
    // per month and then compares it to  
    // average kansas rainfall per month.
    public static String compareRain(double array[]) {
        double total = 0;
        for(int i = 0; i < 12; i++) {
            total += array[i];
        }

        if(total / 12 < kansasAverageRainfall) {
            return "This year's rainfall was less than the U.S average rainfall. ";
        } else if(total / 12 > kansasAverageRainfall) {
            return "This year's rainfall was more than the U.S average rainfall. ";
        } else { 
            return "This year's rainfall was the same as the U.S average rainfall. ";
        }
    }
}