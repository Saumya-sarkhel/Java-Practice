import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int wc = count(str);

        System.out.println("Number of words in the string: " + wc);
        sc.close();
    }

    public static int count(String str) {
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ' && ch != '.' && ch != '\t') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            }
            else {
                inWord = false;
            }
        }
        return count;
    }
}
