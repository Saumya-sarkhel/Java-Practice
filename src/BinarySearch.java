import java.util.Scanner;

public class BinarySearch {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = in.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter value in Sorted order:");
    int i;
    // Input the array elements
    for(i=0; i<n; i++){
      System.out.print("a["+i +"] ");
      arr[i]=in.nextInt();
    }
    System.out.print("Enter the searching value: ");
    int key = in.nextInt();

    // Binary Search
    int first=0;
    int last=n-1;
    int mid;
    int flag=-1;
    while(first <= last){
      mid = (first+last)/2;
      if(arr[mid] == key){
        System.out.println("Value is found at index "+ mid);
        flag = i;
        break;
      }
      else if(arr[mid] > key){
        last = mid - 1;
      }
      else{
        first = mid + 1;
      }
    }
    if(flag == -1){
      System.out.println("Value not found.");
    }
    in.close();
  }
}
