import java.util.Scanner;

public class HotelOccupancy 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        while(true) {
            int floors = 0;
            int totalRooms = 0;
            int totalOccupied = 0;

            while(true)
            { 
                System.out.println("Enter how many floors: ");
                floors = input.nextInt();

                if(floors >= 1)
                {
                    System.out.println();
                    break;
                }
                System.out.println("Invalid answer. Try again.");
                System.out.println();
            }

            for(int i = 0; i < floors; i++)
            {
                int rooms = 0;
                while(true)
                { 
                    System.out.println("Enter how many rooms are on floor " + (i + 1) + ": ");
                    rooms = input.nextInt();

                    if(rooms >= 10)
                    {
                        totalRooms += rooms;
                        break;
                    }
                    System.out.println("Invalid answer. Try again.");
                    System.out.println();
                }
                while(true)
                {
                    System.out.println("How many of those rooms are occupied? ");
                    int occupied = input.nextInt();
                    if(occupied <= rooms && occupied >= 0)
                    {
                        totalOccupied += occupied;
                        System.out.println();
                        break;
                    }
                    System.out.println("Invalid answer. Try again.");
                    System.out.println();
                }
            }

            System.out.print("Number of rooms: ");
            System.out.println(totalRooms);

            System.out.print("Number of rooms occupied: ");
            System.out.println(totalOccupied);

            System.out.print("Number of rooms vacant: ");
            System.out.println(totalRooms - totalOccupied);

            System.out.print("Occupancy rate: ");
            double occupancy = ((double)totalOccupied / (double)totalRooms) * 100;
            System.out.format(" %.2f", occupancy);
            System.out.println(" %");

            input.nextLine();
            System.out.println();
            System.out.println("Would you like to play again? ");
            String option = input.nextLine();
            if(!option.equals("yes")) {
                break;
            }
        }
        input.close();
    }
}
