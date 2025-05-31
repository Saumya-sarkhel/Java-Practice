import java.util.Scanner;

public class palindrome {
  public static void main(String[] args) {
    int n, sum=0, digit;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number only to check palindome or not");
    System.out.print("Enter the number: ");
    n = in.nextInt();
    int k = n;
    while(k!=0){
      digit = (k % 10);
      k = (k/10);
      sum = (sum * 10 + digit);
    }
    if(sum == n){
      System.out.println(n + " is a Palindrome number.");
    }
    else{
      System.out.println(n + " is not a Palindrome number.");
    }
  }
}
