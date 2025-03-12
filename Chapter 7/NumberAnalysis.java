import java.util.Scanner;
import java.io.*;

public class NumberAnalysis {
    String fileName;
    int[] array;

    public NumberAnalysis(String fileName) {
        this.fileName = fileName;

        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);

        int i = 0;
        while(inputFile.hasNextInt()) {
            int line = inputFile.nextInt();
            array[i] = line;
            i++;
        }

        getTotal(array);
        getAverage(array);
        getHighest(array);
        getLowest(array);
    }


    private static void getTotal(int[] array) {
        int total = 0;
        for(int i = 0; i < array.length; i++) {
            total += array[i];
        }

        System.out.println("Total: " + total);
    }

    private static void getAverage(int[] array) {
        double total = 0;
        for(int i = 0; i < array.length; i++) {
            total += array[i];
        }
        double average = (total / array.length) * 100;
        average = Math.round(average);

        System.out.println("Average: " + (average/100));
    }

    private static void getHighest(int[] array) {
        int highest = array[0];

        for(int i = 0; i < array.length; i++) {
            if(highest < array[i]) {
                highest = array[i];
            }
        }
       System.out.println("Highest: " + highest);
    }

    private static void getLowest(int[] array) {
        int lowest = array[0];

        for(int i = 0; i < array.length; i++) {
            if(lowest > array[i]) {
                lowest = array[i];
            }
        }
        System.out.println("Lowest: " + lowest);
    }
}
