import java.util.Scanner;

public class cal{
  public static void main(String[] args) {
    System.out.println("---Enter Number to Calculate---");

    double num1, num2, result = 0;
    char operator;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter first number: "); //number 1
    num1 = in.nextDouble();
    System.out.print("Enter any operator: ");   // operator
    operator = in.next().charAt(0);
    System.out.print("Enter second number: ");  // number 2
    num2 = in.nextDouble();

      switch (operator) {
        case '+': result = num1 + num2;
          break;
        case '-': result = num1 - num2;
          break;
        case '*': result = num1 * num2;
          break;
        case '/':
          if(num2 != 0){
            result =  num1 / num2;
          } else {
              System.out.println("Division by zero is not allowed.");
              return;
            }
        case '%': result = num1 % num2;
          break;
        default: System.out.println("Invalid operator.");
          return;
      }
    System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
  }
}
