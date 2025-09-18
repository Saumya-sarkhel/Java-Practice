//  Java to delete all consonants from an input string and print the resultant string.

import java.util.Scanner;

public class DeleteConst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String:");
        String str = sc.nextLine();

        System.out.println("String is:" + str);
        char s[] = str.toCharArray(); // hello world 123

        String vowel = "aeiouAEIOU";
        String s1 = "";
        for (int i = 0; i < s.length; i++) {
            int x = vowel.indexOf(s[i]);
            if (((s[i] >= 65 && s[i] <= 90) || (s[i] >= 97 && s[i] <= 122)) && x == -1) {
                continue;
            }
            s1 = s1 + s[i];
        }
        System.out.println("After removal of Consonenet ,the String is:" + s1);
        sc.close();
    }

}
