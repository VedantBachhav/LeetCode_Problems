package COM.DSA_Array;
import java.util.Scanner;

public class ReverseStringWithArray {

        public static void main(String[] args) {
            // Create a Scanner object to take input from the user
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a string
            System.out.print("Enter a string to reverse: ");
            String input = scanner.nextLine();

            // Convert the string into a character array
            char[] characters = input.toCharArray();

            // Create a variable to store the reversed string
            String reversed = "";

            // Loop through the character array from the end to the beginning
            for (int i = characters.length - 1; i >= 0; i--) {
                // Append each character to the reversed string
                reversed += characters[i];
            }

            // Display the reversed string
            System.out.println("Reversed string: " + reversed);

            // Close the scanner
            scanner.close();
        }
    }


