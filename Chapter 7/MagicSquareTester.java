import java.util.ArrayList;
import java.util.Scanner;

public class MagicSquareTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            int[][] array = new int[3][3];
            ArrayList<Integer> seen = new ArrayList<Integer>();

            for(int r = 0; r < 3; r++) {
                for(int c = 0; c < 3; c++) {
                    System.out.println("Enter value for row " + (r+1) + " column " + (c+1) + " : ");
                    while(true) {
                        int num = input.nextInt();
                        boolean isUsed = false;
                        for(int i = 0; i < seen.size(); i++) {
                            if(num == seen.get(i)) {
                                isUsed = true;
                            }
                        }

                        if(num <= 9 && num >= 1 && !isUsed) {
                            array[r][c] = num;
                            seen.add(num);
                            break;
                        }
                        System.out.println("Invalid number or already used, try again. ");
                    }
                }
            }

            MagicSquare test = new MagicSquare(array);
            if(test.columns() && test.rows() && test.diagnols()) {
                System.out.println("It is a Lo Shu Magic Square. ");
            } else {
                System.out.println("It isn't a Lo Shu Magic Square. ");
            }


            input.nextLine();
            System.out.println();
            System.out.println("Would you like to test again? ");
            String option = input.nextLine();
            if(option.equals("no")) {
                break;
            }
        }
    }
}
