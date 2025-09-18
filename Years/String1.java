// Write a Java method to count all words in a string and reverse every word and display them.

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:");
        String str=sc.nextLine();

        System.out.println("String is:"+str);
        String a[]=str.split(" ");

        System.out.print("Number of words:"+a.length);
        System.out.println("Reverse of each word is:");
        for (String s:a){
            String rev="";
            for(int i=0;i<s.length();i++){
                rev=s.charAt(i)+rev;
            }
            System.out.print(rev+" ");
        }
        sc.close();
    }
}
