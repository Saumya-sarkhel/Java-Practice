import java.util.Scanner;

public class factorial {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n, i;
    System.out.print("Enter the number n: ");
    n = in.nextInt();
    while(n<0){
      System.out.print("Enter positive number: ");
      n = in.nextInt();
    }
    if(n>=0){
      long fact = 1;
      for(i=1; i<=n; i++){
        fact = fact * i;
      }
      System.out.println("Factorial of " + n + " is: "+ fact);
      in.close();
    }
  }
}
