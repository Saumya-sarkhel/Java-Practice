import java.util.Scanner;

public class temperature {
  public static void main(String[] args) {
    double fren, cel;
    Scanner in = new Scanner(System.in);
    System.out.println("--- Menu --- \n 1. Celcius to Farenheit \n 2. Farenheit to Celcius\n 3. Exit");
    System.out.print("Enter Your choice: ");
    int choise = in.nextInt();

    switch(choise){
      case 1: {   // Celcius to Farenheit
        System.out.print("Enter the temperature in celsius: ");
        cel = in.nextDouble();
        fren = ((cel * 9)/5) + 32;
        System.out.println("The Temperature in Farenheit is: "+ fren);
        break;
      }
      case 2:{    // Farenheit to Celcius
        System.out.print("Enter Temperature in Farenheit: ");
        fren = in.nextDouble();
        cel = ((fren - 32) * 5/9);
        System.out.println("The Temparature in Celcius is: "+ cel);
        break;
      }
      case 3: {
        System.out.println("Operation terminated.");
        System.exit(1);
      }
      default: System.out.println("Invalid Operation");
        return;
    }
  }
}
