/* Delete element from specific index */

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

        int[] arr_new = new int[arr.length-1];

        System.out.print("Enter index: ");
        int j = in.nextInt();

        for(int i=0, k=0;i<arr.length;i++){
            if(i!=j){
                arr_new[k]=arr[i];
                k++;
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(arr_new));

        in.close();
    }
}
