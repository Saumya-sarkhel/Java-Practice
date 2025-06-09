import java.util.Scanner;

public class Oddeven {
  public static void main(String[] args) {
    int num;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter number to check Odd/Even: ");
    num = in.nextInt();

    if(num % 2 == 0){
      System.out.println("Number " + num + " is Even");
    }
    else{
      System.out.println("Number " + num + " is Odd");
    }
    in.close();
  }
}
