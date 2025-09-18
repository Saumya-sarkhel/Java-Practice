// Using methods charAt() and lengths() of string class, write a Java program to print the frequency of each character in a string.

import java.util.Scanner;

public class CharFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        System.out.print("String is: " + str);
        int v[] = new int[str.length()];
        for (int i = 0; i < str.length(); i++)
            v[i] = 0;
        for (int i = 0; i < str.length(); i++) {

            int count = 1;
            if (v[i] == 0 && str.charAt(i) != ' ') {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        v[j] = 1;
                        count++;
                    }
                }
                System.out.println(str.charAt(i) + " is occure " + count + " times.");
            }
        }
        sc.close();
    }
}
