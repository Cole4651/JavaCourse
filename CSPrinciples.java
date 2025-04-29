import java.util.Scanner;

// Compares rainfall of this year to the Kansas average rainfall per month
public class CSPrinciples {
    public static final double kansasAverageRainfall = 5.21;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] array = new double[12];
        for(int i = 0; i < 12; i++) {
            System.out.println("Enter rainfall for month " + (i + 1) + ": ");
            double rain = input.nextDouble();
            array[i] = rain;
        }

        System.out.println(compareRain(array));


    }

    public static String compareRain(double array[]) {
        double total = 0;
        for(int i = 0; i < 12; i++) {
            total += array[i];
        }

        if(total / 12 < kansasAverageRainfall) {
            return "This year's monthly average rainfall was less than the Kansas monthly average rainfall. ";
        } else if(total / 12 > kansasAverageRainfall) {
            return "This year's monthly average rainfall was more than the Kansas monthly average rainfall. ";
        } else { 
            return "This year's monthly average rainfall was the same as the Kansas monthly average rainfall. ";
        }
    }
}