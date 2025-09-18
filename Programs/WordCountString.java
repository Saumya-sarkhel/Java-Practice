import java.util.Scanner;

public class WordCountString {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the sentence: ");
    String name = in.nextLine();
    int count = 0;
    int inword = -1;

    for (int i = 0; i < name.length(); i++) {
      if (name.charAt(i) != ' ') {
        if (inword == -1) {
          count++;
          inword = i;
        }
      }
      else {
        inword = -1;
      }
    }
    System.out.println("No of Words in the string is: "+ count);
    in.close();
  }
}
