import java.util.Scanner;

public class Quadratic {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter coefficient a: ");
    double a = in.nextDouble();

    System.out.print("Enter coefficient b: ");
    double b = in.nextDouble();

    System.out.print("Enter coefficient c: ");
    double c = in.nextDouble();

    double D = b * b - 4 * a * c;   // Discriminant
    System.out.println("The Equation is: " + a + "x^2 + " + b + "x + " + c + " = 0");
    System.out.println();

    if(D > 0){
      System.out.println("There are two real roots");
      double root1 = (-b + Math.sqrt(D)) / (2 * a);
      double root2 = (-b - Math.sqrt(D)) / (2 * a);
      System.out.println("Root 1 = " + root1);
      System.out.println("Root 2 = " + root2);
    }
    else if(D < 0){
      System.out.println("There are two complex imaginary roots.");
      double root1 = -b / (2 * a);
      double root2 = Math.sqrt(-D) / (2 * a);
      System.out.println("Root 1 = " + String.format("%.2f", root1) + " + " + String.format("%.2f", root2) + "i");
      System.out.println("Root 2 = " + String.format("%.2f", root1) + " - " + String.format("%.2f", root2) + "i");
    }
    else{ //(D == 0)
      System.out.println("Roots are Real and Equal.");
      double root = -b / (2 * a);
      System.out.println("Root = " + root);
    }
    in.close();
  }
}
