/*
    Using methods charAt() and lengths() of string class,
    write a Java program to print the frequency of each character in a string.
*/

import java.util.Scanner;

public class CharFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        int length = str.length();
        int[] freq = new int[length];
        char[] chars = str.toCharArray();

        for (int i=0; i<length; i++) {
            freq[i] = 1; // Each character appears once initially

            for (int j=i+1; j<length; j++) {
                if (chars[i] == chars[j] && chars[i] != ' ') {
                    freq[i]++;
                    chars[j] = '0'; // Mark this character as counted
                }
            }
        }

        // Print character frequencies
        System.out.println("Character frequencies:");
        for (int i=0; i<length; i++) {
            if (chars[i] != ' ' && chars[i] != '0') {
                System.out.println(chars[i] + " occurs " + freq[i] + " times");
            }
        }
        sc.close();
    }
}
