import java.util.Scanner;

public class String_input {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Using next() method: reads input until the first whitespace (space, tab, etc.)
    String singleWord;
    System.out.print("Enter a single word string: ");
    singleWord = sc.next(); // Only the first word before a space will be read
    System.out.println("You entered (single word): " + singleWord);

    // Clear the input buffer before using nextLine()
    sc.nextLine(); // Consume the leftover newline character

    // Using nextLine() method: reads the entire line, including spaces
    String multiWord;
    System.out.print("Enter a multi-word string: ");
    multiWord = sc.nextLine(); // Reads the whole line, including spaces
    System.out.println("You entered (multi-word): " + multiWord);

    sc.close();
  }
}
