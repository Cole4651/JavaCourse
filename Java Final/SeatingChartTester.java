import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class SeatingChartTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Seating Chart");
        while(true) {
            int rows = 0;
            while(true) {
                System.out.println("How many columns are in your class room? ");
                rows = input.nextInt();
                if(rows >= 1) {
                    break;
                }
                System.out.println("Invalid input, try again. ");
            }
            int columns = 0;
            while(true) {
                System.out.println("How many rows are in your class room? ");
                columns = input.nextInt();
                if(columns >= 1) {
                    break;
                }
                System.out.println("Invalid input, try again. ");
            }

            SeatingChart seatingChart = new SeatingChart(rows, columns);

            int students = 0;
            while (true) { 
                System.out.println("How many students do you have? ");
                students = input.nextInt();
                if(students >= 1 && students <= (rows * columns)) {
                    break;
                }
                System.out.println("Invalid input, try again. ");
            }
            input.nextLine();

            for(int i = 0; i < students; i++) {
                System.out.println("Enter Student " + (i+1) + ": ");
                String name = input.nextLine();
                while(true) {
                    int row = random.nextInt(0, rows);
                    int column = random.nextInt(0, columns);
                    if(seatingChart.isAvailable(row, column)) {
                        seatingChart.addStudent(name, row, column);
                        break;
                    }
                }
            }
            System.out.println();
            int maxWidth = seatingChart.getMaxWidth();
            System.out.println("Classroom layout: ");
            for(int c = 0; c < columns; c++) {
                for(int r = 0; r < rows; r++) {
                    String name = seatingChart.getStudent(r,c);
                    System.out.printf("%-" + maxWidth + "s ", (name == null) ? "" : name);
                }
                System.out.println();
            } 

            try(BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"))){
                for(int r = 0; r < rows; r++) {
                    for(int c = 0; c < columns; c++) {
                        if(seatingChart.getStudent(r, c) == null) {
                            writer.newLine();
                        } else {
                            writer.write(seatingChart.getStudent(r, c));
                            writer.newLine();
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


            System.out.println("Would you like to test again? ");
            String option = input.nextLine();
            if(option.equals("no")) {
                break;
            }
        }
    }
}
