import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number for Fibonacci series: ");
        int n = in.nextInt();
        printfibonacci(n);
        in.close();
    }

  static void printfibonacci(int n){
    int i;
    for(i=0; i<n; i++){
      System.out.println(fibonaccinum(i));
    }
  }

  static int fibonaccinum(int n){
    if(n<=1){
      return n;
    }
    else{
      return fibonaccinum(n-1) + fibonaccinum(n-2);
    }
  }
}
