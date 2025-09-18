import java.util.Scanner;

public class Dynamic_1D_array {

  public static void main(String[] args) {
    int a[], i;

    // Use try-with-resources to automatically close the Scanner after use
    try (Scanner sc = new Scanner(System.in)) {

      // Prompt user to enter the number of elements for the array (dynamic size)
      System.out.print("Enter the number of elements: ");
      int n = sc.nextInt();

      // Dynamically allocate memory for the array based on user input
      a = new int[n];

      for (i = 0; i < a.length; i++) {
        System.out.print("A[" + i + "] = ");
        a[i] = sc.nextInt();
      }

      System.out.println("Array elements are:");
      for (i = 0; i < a.length; i++) {
        System.out.println("A[" + i + "] = " + a[i]);
      }
    }
    // Scanner is automatically closed here due to try-with-resources
  }
}
