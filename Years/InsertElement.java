/* insert element at any index */

import java.util.Scanner;
import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter array index (0 to " + n + "): ");
        int index = sc.nextInt();

        // Index validation
        if (index < 0 || index > n) {
            System.out.println("Invalid index.");
            sc.close();
            return;
        }

        System.out.print("Enter the value to insert: ");
        int newValue = sc.nextInt();

        // Create new array of size n + 1
        int[] newArray = new int[n + 1];

        // Copy elements before index
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }

        // Insert new value at index
        newArray[index] = newValue;

        // Shift remaining elements to the right by one position
        for (int i = index; i < n; i++) {
            newArray[i + 1] = array[i];
        }

        System.out.println("Original Array : " + Arrays.toString(array));
        System.out.println("New Array: " + Arrays.toString(newArray));

        sc.close();
    }
}
