/*
Write a java program to delete an element from a specific index of an array.
*/

import java.util.*;

public class DeleteElementAtIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Enter index to delete: ");
        int index = in.nextInt();

        // Validate the index
        if (index < 0 || index >= n) {
            System.out.println("Invalid index!");
            System.out.println("Array remains: " + Arrays.toString(arr));
        }
        else {
            // Remove element at given index
            int[] newarr = removeElementAtIndex(arr, index);

            System.out.println("Before deletion : " + Arrays.toString(arr));
            System.out.println("After deletion  : " + Arrays.toString(newarr));
        }
        in.close();
    }

    // Function to remove element at specified index and return new array
    public static int[] removeElementAtIndex(int[] arr, int index) {
        int[] newarr = new int[arr.length - 1];

        // Copy elements before the index
        for (int i=0; i<index; i++) {
            newarr[i] = arr[i];
        }

        // Copy elements after the index, shifting left by one place
        for (int i=index+1; i<arr.length; i++) {
            newarr[i - 1] = arr[i];
        }
        return newarr;
    }
}
