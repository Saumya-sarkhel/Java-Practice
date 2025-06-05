import java.util.Scanner;

public class fibonacci {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number for Fibonacci series: ");
    int n = in.nextInt();
    int i, c, a=0, b=1;
    System.out.println("Fibonacci Series is: ");
    for(i=0; i<n; i++){
      System.out.print(a + " ");
      c = a + b;
      a = b;
      b = c;
    }
    System.out.println();
  }
}
