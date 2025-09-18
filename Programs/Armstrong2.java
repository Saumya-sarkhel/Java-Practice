import java.util.Scanner;

public class Armstrong2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Find Armstrong number in a given range:-");
    System.out.print("Enter the lower bound: ");
    int low = in.nextInt();
    System.out.print("Enter the Upper Bound: ");
    int up = in.nextInt();
    System.out.println("Armstromg number in range " + low + " - " + up);
    int i;
    for(i = low; i <= up; i++){
      int temp=i, sum=0, count=0;
      // Count number of digits
      while(temp != 0){
        temp = temp / 10;
        count++;
      }
      //Calculating the sum of Digits to the power digits
      temp = i;
      while(temp != 0){
        int digit = temp % 10;
        sum += Math.pow(digit, count);
        temp = temp /10;
      }
      if(i == sum){
        System.out.println(sum);
      }
      in.close();
    }
  }
}
