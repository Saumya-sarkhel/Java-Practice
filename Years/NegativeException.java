// Write a program in Java to create your own exception as Negative Exception whenever negative values are put in an array.

import java.util.Scanner;

class NegativeNumException extends Exception {
    String errorMsg;

    NegativeNumException(String msg) {
        errorMsg = msg;
    }

    public String getMessage() {
        return errorMsg;
    }

}

public class NegativeException{
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        num=sc.nextInt();
        int a[]=new int[num];
        System.out.println("Enter the elements:");
        try {
            for (int i = 0; i < num; i++) {
                a[i] = sc.nextInt();
                if (a[i] < 0) {
                    throw new NegativeNumException("Can't input Negative number!");
                }
            }
        } catch (NegativeNumException e) {
            System.out.println("Exception Handeled:" + e);
        }
    }
}
