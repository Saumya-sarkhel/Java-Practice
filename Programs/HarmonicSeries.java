import java.util.Scanner;

public class HarmonicSeries {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n;
    double sum = 0;
    System.out.print("Enter the number: ");
    n = in.nextInt();
    for(int i = 1; i <= n; i++) {
      sum += 1.0 / i;
    }
    System.out.printf("Sum of the series up to %d terms: %.2f\n", n, sum);
    in.close();
  }
}
