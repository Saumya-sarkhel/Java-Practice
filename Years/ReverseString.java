/* Reverse a sting */
import java.util.Scanner;

public class Reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();

        String reversed = "";

        // Loop from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);  // Add characters in reverse order
        }

        System.out.println("Reversed string: " + reversed);
        sc.close();
    }
}
