// Sample:
// Input: array = {0, 2, 4, 8, 2, 9, 2, 0}; element = 2
// Output: 3
// Output: array = {0, 3(2+1), 4, 8, 6(2+4), 9, 8(2+6), 0}.

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array elements :");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the seraching elements:");
        int key = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                count++;
                a[i] = key + i;
            }
        }
        System.out.println(key + " occure " + count + " times.");
        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }

}
