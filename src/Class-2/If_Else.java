// Program to find the maximum among three numbers

import java.util.Scanner;

public class If_Else {
  public static void main(String[] args) {

    // Create Scanner object to read input from user
    Scanner sc = new Scanner(System.in);

    // Prompt user to enter three numbers
    System.out.print("Enter 3 number: ");
    int x = sc.nextInt(); // Read first number
    int y = sc.nextInt(); // Read second number
    int z = sc.nextInt(); // Read third number
    int max;

    // Check if all three numbers are equal
    // Nested If-Else condition
    if (x == y && y == z) {
      System.out.println("All Numbers are equal");
    }
    else {
      // If not all numbers are equal, find the maximum
      if (x > y) {
        if (x > z) {
          max = x; // x is greater than both y and z
        }
        else {
          max = z; // z is greater than or equal to x
        }
      }
      else {
        if (y > z) {
          max = y; // y is greater than both x and z
        }
        else {
          max = z; // z is greater than or equal to y
        }
      }
      // Output the maximum value
      System.out.println("Maximum is: " + max);
    }
    sc.close();
  }
}
