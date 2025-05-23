
import java.util.Scanner;

public class swap {
  public static void main(String[] args) {
    int x;
    Scanner in = new Scanner(System.in);
    System.out.println("1. Swap using Variable\n2. Swap without Variable\n3. exit");
    System.out.print("Enter your choice: ");
    x = in.nextInt();
    switch(x){
      case 1: {     // Uisng third variable
        int a, b, c;
        System.out.print("Enter the value of a: ");
        a = in.nextInt();
        System.out.print("Enter the value of b: ");
        b = in.nextInt();

        c = a;
        System.out.println("Step 1: " + "c " + "<-- " + a);
        a = b;
        System.out.println("Step 2: " + "a " + "<-- " + "b" + "("+ b + ")");
        b = c;
        System.out.println("Step 3: " + "b " + "<-- " + "c" + "("+ c + ")");
        System.out.println();

        System.out.println("Present value in a is: " + a);
        System.out.println("Present value in b is: " + b);
        break;
      }
      case 2: {   // Wuthout using third variable
        int num1, num2;
        System.out.print("Enter the number num1: ");
        num1 = in.nextInt();
        System.out.print("Enter the number num2: ");
        num2 = in.nextInt();
        System.out.println();

        System.out.println("num1" + " <-- " + num1 + "(num1)" + " + " + num2 + "(num2)");
        num1 = num1 + num2;
        System.out.println("---> so num1 = " + num1);
        System.out.println("num2" + " <-- " + num1 + "(num1)" + " - " + num2 + "(num2)");
        num2 = num1 - num2;
        System.out.println("---> so num2 = " + num2);
        System.out.println("num1" + " <-- " + num1 + "(num1)" + " - " + num2 + "(num2)");
        num1 = num1 - num2;
        System.out.println("---> so num1 = " + num1);
        System.out.println();
        System.out.println("The value of num1 is: " + num1);
        System.out.println("The value of num2 is: " + num2);
        break;
      }
      case 3:{
        System.out.println("Operation terminated.");
        System.exit(1);
      }
      default:{
        System.out.println("Invalid option.");
        return;
      }
    }
  }
}
