import java.util.Scanner;

public class perfect {
  public static void main(String[] args) {
    int n, i, sum=0;
    try (Scanner in = new Scanner(System.in)) {
      System.out.print("Enter the number: ");
      n = in.nextInt();

      for(i=1; i<n; i++){
        if(n % i == 0){
          sum += i;
        }
      }
      if(sum == n){
        System.out.println(n + " is a Perfect numebr.");
      }
      else{
        System.out.println(n + " is not a Perfect number.");
      }
    }
  }
}
