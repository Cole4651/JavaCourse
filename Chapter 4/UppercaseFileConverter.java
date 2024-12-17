import java.io.*;
import java.util.Scanner;

public class UppercaseFileConverter
{
    public static void main(String[] args) throws IOException
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first file name: ");
        String filename = input.nextLine();

        System.out.print("Enter second file name: ");
        String file2name = input.nextLine();

        System.out.println();
        
        File file = new File(filename);
        File file2 = new File(file2name);

        if (!file.exists())
        {
            System.out.println("The file is not found.");
            System.exit(0); 
        }
        else
        {
            if(!file2.exists())
            {
                System.out.println("File named '" + file2name + "' was created. ");
            }
            PrintWriter outputFile = new PrintWriter(file2);
            Scanner inputFile = new Scanner(file);

            while(inputFile.hasNext())
            {
                String line = inputFile.nextLine();
                outputFile.println(line.toUpperCase());
            }

            inputFile.close();
            outputFile.close();
        }
        System.out.println("Text converted to uppercase to '" + file2name + "' file. ");

    }
}