import java.util.Scanner;

public class Jagged_array {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Create Scanner object for input

    // Prompt user to enter the number of rows (outer array size)
    System.out.print("Enter the number of rows: ");
    int r = sc.nextInt();

    // Declare a jagged array (array of arrays) with 'r' rows
    int a[][] = new int[r][];
    int i, j;

    // For each row, prompt user to enter the number of columns (inner array size)
    for (i = 0; i < a.length; i++) {
      System.out.print("Enter the number of columns for row " + i + ": ");
      int c = sc.nextInt();
      a[i] = new int[c]; // Initialize the current row with 'c' columns
    }

    // Input elements for the jagged array
    System.out.println("Enter the elements:");
    for (i = 0; i < a.length; i++){
      for (j = 0; j < a[i].length; j++){
        a[i][j] = sc.nextInt();
      }
    }

    // Display the jagged array elements using a standard for loop
    System.out.println("Array elements are:");
    for (i = 0; i < a.length; i++){
      for (j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }

    // Display the jagged array elements using enhanced for loop
    System.out.println("Array elements are (using enhanced for loop):");
    for (int[] x : a) { // For each row array 'x' in 'a'
      for (int y : x) { // For each element 'y' in row 'x'
        System.out.print(y + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
