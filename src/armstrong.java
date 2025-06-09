import java.util.Scanner;

public class armstrong {
  public static void main(String[] args) {
    int i, n, rem;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number: ");
    n = in.nextInt();

    int num = n;
    int count = 0;
    // Count number of digits
    while(num != 0){
      num = num /10;
      count++;
    }
    num = n;
    int sum = 0;
    //Calculating the sum of Digits to the power digits
    while(num != 0){
      int pow = 1;
      rem = num % 10;
      for(i=0; i<count; i++){
        pow *= rem;
      }
      sum = sum + pow;
      num = num / 10;
    }
    // Checking the armstrong number
    if (sum == n) {
      System.out.println(n + " is an Armstrong Number.");
    }
    else {
      System.out.println(n + " is not an Armstrong Number.");
    }
    in.close();
  }
}
