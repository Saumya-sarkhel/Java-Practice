import java.util.Scanner;

public class Enhance_for_loop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Create Scanner object

    // ================== 1D ARRAY DEMO ==================
    System.out.println("\n===== 1D Array Demo =====");

    // Get array size
    System.out.print("Enter number of elements for 1D array: ");
    int n = sc.nextInt();

    int[] oneDArr = new int[n]; // Declare 1D array

    // Input elements using standard for loop
    System.out.println("Enter elements:");
    for (int i = 0; i < oneDArr.length; i++) {
      System.out.print("oneDArray[" + i + "] = ");
      oneDArr[i] = sc.nextInt();
    }

    // Display using enhanced for loop
    System.out.println("1D Array elements (enhanced for loop):");
    for (int x : oneDArr) {
      System.out.print(x + " ");
    }

    // ================== 2D ARRAY DEMO ==================
    System.out.println("\n\n===== 2D Array Demo =====");

    // Get matrix dimensions
    System.out.print("Enter rows for 2D array: ");
    int rows = sc.nextInt();
    System.out.print("Enter columns for 2D array: ");
    int cols = sc.nextInt();

    int[][] twoDArr = new int[rows][cols]; // Declare 2D array

    // Input elements using nested standard loops
    System.out.println("Enter elements:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print("twoDArray[" + i + "][" + j + "] = ");
        twoDArr[i][j] = sc.nextInt();
      }
    }

    // Display using nested enhanced for loops
    System.out.println("2D Array elements (enhanced for loop):");
    for (int[] row : twoDArr) {
      for (int y : row) {
        System.out.print(y + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
