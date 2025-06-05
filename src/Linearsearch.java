import java.util.Scanner;

public class Linearsearch {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int i;
    System.out.print("Enter the size: ");
    int n = in.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter the elements: ");
    // Input the array elements
    for(i=0; i<n; i++){
      System.out.print("a["+i +"] ");
      arr[i]=in.nextInt();
    }
    System.out.print("Ente the searching value: ");
    int key = in.nextInt();
    int flag=-1;
    // Linear search through array
    for(i=0;i<arr.length; i++){
      if(key == arr[i]){
        flag=i;
        break;
      }
    }
    if(flag == -1){
      System.out.println("Value did not found.");
    }else{
      System.out.println("The value is found at index " + flag);
    }
  }
}
