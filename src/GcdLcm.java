import java.util.Scanner;

public class GcdLcm {
  public static void main(String[] args) {
    int n1, n2;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter first number: ");
    n1 = in.nextInt();
    System.out.print("Enter second number: ");
    n2 = in.nextInt();
    int term;
    if(n1 < n2){
      term = n1;
    }
    else{
      term = n2;
    }
    int gcd=1, count=1;
    while(count <= term){
      if(n1 % count == 0 && n2 % count == 0){
        gcd = count;
      }
      count += 1;
    }
    int lcm = (n1 * n2) / gcd;
    System.out.println("GCD: "+ gcd);
    System.out.println("LCM: "+ lcm);
  }
}
