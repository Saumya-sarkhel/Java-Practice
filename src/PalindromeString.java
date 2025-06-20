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



// import java.io.*;  // Short Method using BuferReader

// class Palindrome {
//   public static void main(String[] args) throws IOException {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     System.out.print("Enter the string: ");
//     String str = br.readLine();
//     String temp = str;
//     StringBuffer sb = new StringBuffer(str);
//     sb.reverse();
//     if (temp.equalsIgnoreCase(str))
//       System.out.println(temp + " is Palindrome");
//     else
//       System.out.println(temp + " is not a Plaindrome.");
//   }
// }
