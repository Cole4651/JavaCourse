import java.util.Scanner;

public class RoomTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            RoomDimension room;
            RoomCarpet carpet;
            while(true) {
                System.out.println("Enter width of room: ");
                double width = input.nextDouble();
                System.out.println("Enter length of room: ");
                double length = input.nextDouble();
                System.out.println("Enter price per square foot of desired carpenting: ");
                double price = input.nextDouble();

                if(width >= 0 && length >= 0) {
                    room = new RoomDimension(width, length);
                    carpet = new RoomCarpet(room, price);
                    break;
                }
                System.out.println("Something is invalid. ");
            }
            
            System.out.println("Total cost of carpeting: $" + carpet.getCost());


            System.out.println();
            System.out.println("Would you like to test again? ");
            input.nextLine();
            String option = input.nextLine();
            if(option.equals("no")) {
                break;
            }
        }
    }
}
