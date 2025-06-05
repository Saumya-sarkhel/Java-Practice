import java.util.Scanner;

public class loop {
  public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = in.nextInt();

    int arr[] = new int[n];
    int i, sum=0;
    System.out.println("Enter the elements: ");
    for(i=0; i<n; i++){
      System.out.print("a["+i +"] ");
      arr[i]=in.nextInt();
    }
    //enhanced for loop
    for(int num:arr){
      sum += num;
    }
    // Calculate the Sum and Average
    float avg = sum / n;
    System.out.println("Sum is = " + sum);
    System.out.println("Average is = " + avg);
  }
}
