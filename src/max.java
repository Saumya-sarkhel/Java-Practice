import java.util.Scanner;

public class max {
  public static void main(String[] args) {
    int x;
    Scanner in = new Scanner(System.in);
    System.out.println("1. Maximum of Three num\n2. Maximum of Four num\n3. Exit");
    System.out.print("Enter your choice: ");
    x = in.nextInt();
    switch (x) {
      case 1: { // max of three
        int a, b, c;
        System.out.print("Enter the number 1: ");
        a = in.nextInt();
        System.out.print("Enter the number 2: ");
        b = in.nextInt();
        System.out.print("Enter the number 3: ");
        c = in.nextInt();
        int max = a;
        if(a == b && a == c){
          System.out.println("All numbers are equal.");
        }else{
          if (b > max) max = b;
          if (c > max) max = c;
        }
        System.out.println("Maximum number is: " + max);
        break;
      }
      case 2: {   // Max of Four
        int n1, n2, n3, n4, max;

        System.out.print("Enter the number 1: ");
        n1 = in.nextInt();
        System.out.print("Enter the number 2: ");
        n2 = in.nextInt();
        System.out.print("Enter the number 3: ");
        n3 = in.nextInt();
        System.out.print("Enter the number 4: ");
        n4 = in.nextInt();

        if (n1 == n2 && n2 == n3 && n3 == n4) {
        System.out.println("All the numbers are equal.");
        } else {
          max = n1;
          if (n2 > max) max = n2;
          if (n3 > max) max = n3;
          if (n4 > max) max = n4;
          System.out.println("The maximum number is " + max);
        }
        break;
      }
      case 3: {
        System.out.println("Operation terminated.");
        System.exit(1);
      }
      default: {
        System.out.println("Invalid option.");
        return;
      }
    }
  }
}
