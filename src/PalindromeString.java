import java.util.Scanner;

public class PalindromeString {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String name = in.nextLine();

    String newname = name.toLowerCase();
    int i=0, j=name.length() - 1;
    boolean ispal = true;

    while(i<j){ // Palindrome String checking Case-Insensitive
      if(newname.charAt(i) != newname.charAt(j)){
        ispal = false;
        break;
      }
      i++;
      j--;
    }
    if(ispal){
      System.out.println(name + " is a Palindrome Number.(Case-Insensitive)");
    }
    else{
      System.out.println(name + " is Not a Palindrome Number.(Case-Insensitive)");
    }
    in.close();
  }
}
