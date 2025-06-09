import java.util.Scanner;

public class prime {
  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      int i,num, flag=0;
      System.out.print("Enter the number: ");
      num = in.nextInt();

      for (i=1; i<=num; i++){
        if(num % i == 0){
          flag += 1;
        }
      }
      if(flag == 2){
        System.out.println(num + " is a prime number.");
      }else if (flag == 1) {
        System.out.println(num + " is not prime number or composite number.");
      }else{
        System.out.println(num + " is not a prime number.");
      }
    }
  }
}
