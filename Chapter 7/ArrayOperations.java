import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            int length;
            while (true) { 
                System.out.println("How many elements are in the array? ");
                length = input.nextInt();
                if(length > 0) {
                    break;
                } 
                System.out.println("Invalid input, try again. ");
            }
            int[] array = new int[length];

            for(int i = 0; i < length; i++) {
                System.out.println("Enter element " + (i+1) + ": ");
                array[i] = input.nextInt();
            }

            System.out.println("Total: " + getTotal(array));
            System.out.println("Average: " + getAverage(array));
            System.out.println("Highest: " + getHighest(array));
            System.out.println("Lowest: " + getLowest(array));


            input.nextLine();
            System.out.println();
            System.out.println("Would you like to test again? ");
            String option = input.nextLine();
            if(option.equals("no")) {
                break;
            }
        }
    }

    private static int getTotal(int[] array) {
        int total = 0;
        for(int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }

    private static double getAverage(int[] array) {
        double total = 0;
        for(int i = 0; i < array.length; i++) {
            total += array[i];
        }
        double average = (total / array.length) * 100;
        average = Math.round(average);
        return average / 100;
    }

    private static int getHighest(int[] array) {
        int highest = array[0];

        for(int i = 0; i < array.length; i++) {
            if(highest < array[i]) {
                highest = array[i];
            }
        }
        return highest;
    }

    private static int getLowest(int[] array) {
        int lowest = array[0];

        for(int i = 0; i < array.length; i++) {
            if(lowest > array[i]) {
                lowest = array[i];
            }
        }
        return lowest;
    }
}
