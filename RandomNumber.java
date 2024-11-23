package ak;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        try {
            // Check and create the file if it doesn't exist
            File presistN = new File("Number.txt"); // Corrected file extension to .txt
            if (presistN.createNewFile()) {
                System.out.println("File is created.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error while creating the file.");
            e.printStackTrace();
        }

        boolean numberPresent = true;
        boolean found = false;

        while (numberPresent) {
            Random ran = new Random();
            int randomnum = ran.nextInt(187) + 1;

            File myobj = new File("Number.txt"); // Corrected file extension to .txt
            try (Scanner sc = new Scanner(myobj)) {
                while (sc.hasNextLine()) {
                    String data = sc.nextLine();
                    System.out.println("Reading data: " + data);
                    
                    if (Integer.toString(randomnum).equals(data)) {
                        System.out.println("Found!!");
                        found = true;
                        break;
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found.");
                e.printStackTrace();
            }

            if (!found) {
                try (FileWriter myWriter = new FileWriter("Number.txt", true)) {
                    myWriter.write(randomnum + "\n"); // Add a newline character
                    System.out.println("Successfully wrote " + randomnum + " to the file.");
                    numberPresent = false; // Exit the loop after writing the number
                } catch (IOException e) {
                    System.out.println("An error occurred while writing to the file.");
                    e.printStackTrace();
                }
            }
        }
    }
}
