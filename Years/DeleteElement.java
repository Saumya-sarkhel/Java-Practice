/* Write a java program to delete a specific element from an array */

import java.util.*;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = in.nextInt();

        // Initialize array of size n
        int[] arr = new int[n];

        System.out.print("Enter elements: ");
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter element to delete: ");
        int key = in.nextInt();

        // Count how many elements are not equal to the key
        // This will determine the size of the new array after deletion
        int count = 0;
        for(int i=0; i<n; i++){
            if(key != arr[i]){
                count++;

            }
        }
        // Create new array to hold elements after deletion
        int[] newarr = new int[count];
        int idx = 0;
        // Copy all elements except the ones equal to key into new array
        for(int i = 0; i < n; i++) {
            if(arr[i] != key) {
                newarr[idx++] = arr[i];
            }
        }

        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(newarr));

        in.close();
    }
}
