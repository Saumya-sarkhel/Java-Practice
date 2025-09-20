/*

Write a Java program to print all permutations of a given string of length 3 (repetition not allowed).

Eg. If the given string is ABC then the permutated strings are:
ABC, ACB, BAC, CBA, CAB, BAC

*/

import java.util.Scanner;

public class Permutation {

    static void findPermutation(String s1, String s2) {
        if (s1.length() == 0) {
            System.out.println(s2);
            return;
        }
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            String p = s1.substring(0, i) + s1.substring(i + 1);
            findPermutation(p, s2 + c);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");

        String str = sc.nextLine();

        System.out.println("Permutation of String " + str + " are:");
        findPermutation(str, "");
        sc.close();
    }
}
