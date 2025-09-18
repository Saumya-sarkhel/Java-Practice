import java.util.Scanner; // Import Scanner class for user input

public class Strings {

  public static void main(java.lang.String[] args) {
    Scanner sc = new Scanner(System.in); // Create Scanner object

    // Declare and initialize a character array
    char s[] = { 'h', 'e', 'l', 'l', 'o' }; // This is a character array, not a String
    System.out.println("Character array is: " + new String(s)); // Print the character array as a String

    // Declare and initialize a String
    String name = "Hello World"; // This is a String
    System.out.println("Your name is (String): " + name); // Print the String

    // Accessing an element from character array using index is possible
    System.out.println(s[2]);

    // Correct way to access a character from a String using charAt()
    System.out.println(name.charAt(0));
    sc.close();
  }
}
