/* Count no of word in a string */

import java.util.Scanner;

public class CountWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();

        System.out.println("String is:" + str);

        String a[] = str.split(" ");

        System.out.println("Number of words:" + a.length);

        // reversew each word
        System.out.println("Reverse of each word is:");
        for (String s : a) {
            String rev = "";
            for (int i = 0; i < s.length(); i++) {
                rev = s.charAt(i) + rev;
            }
            System.out.print(rev + " ");

        }
        sc.close();
    }

}
