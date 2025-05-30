import java.util.Scanner;

public class prime {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num;
    boolean flag=true;
    System.out.print("Enter the number: ");
    num = in.nextInt();
    int i=0;
    if(num==0 || num==1){
      flag=false;
    }
    for (i=2; i<=num/2; i++){
      if(num % i == 0){
        flag = false;
        break;
      }
    }
    if(flag){
      System.out.println(num + " is a prime number.");
    }
    else{
      System.out.println(num + " is not a prime number.");
    }
  }
}
