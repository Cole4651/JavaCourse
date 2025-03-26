import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberAnalysisTester {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        File file = new File("Numbers.txt");
        try(Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextInt()) {
                int number = scanner.nextInt();
                array.add(number);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }


        NumberAnalysis test = new NumberAnalysis(array);

        System.out.println("Lowest Number: " + test.getLowest());
        System.out.println("Highest Number: " + test.getHighest());
        System.out.println("Total of Numbers: " + test.getTotal());
        System.out.println("Average of Numbers: " + test.getAverage());

    }
}
