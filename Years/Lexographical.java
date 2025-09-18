import java.util.Scanner;

public class Lexographical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first String: ");
        String s1 = sc.nextLine();

        System.out.print("Enter the second String: ");
        String s2 = sc.nextLine();

        int r = s1.compareTo(s2);

        if (r == 0) {
            System.out.println("The strings are equal.");
        }
        else if (r < 0) {
            System.out.println("\"" + s1 + "\" is lexicographically smaller than \"" + s2 + "\".");
        }
        else {
            System.out.println("\"" + s1 + "\" is lexicographically greater than \"" + s2 + "\".");
        }
        sc.close();
    }
}
