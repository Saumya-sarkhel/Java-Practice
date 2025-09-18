import java.util.Scanner;

public class Character_array1 {

  public static void main(java.lang.String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of the string: ");
    int n = sc.nextInt(); // Read the length of the string

    // Declare a character array of size 'n'
    char s[] = new char[n];

    // Prompt user to enter the characters of the string one by one
    System.out.println("Enter the string (character by character):");
    for (int i = 0; i < s.length; i++) {
      System.out.print("S[" + i + "] = ");
      s[i] = sc.next().charAt(0); // Read a single character and store in array
    }

    // Display the string by printing all characters in the array
    System.out.print("String is: ");
    for (char x : s) {
      System.out.print(x); // Print each character
    }
    sc.close();
  }
}
