import java.util.Scanner; // Import Scanner class for user input

public class Switch_case {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int day; // Variable to store the day number

    System.out.print("Enter the day: ");
    day = sc.nextInt();

    while (true) {
      // Switch-case to print the day name based on user input
      switch (day) {
        case 1:
          System.out.println("Sunday");
          break;
        case 2:
          System.out.println("Monday");
          break;
        case 3:
          System.out.println("Tuesday");
          break;
        case 4:
          System.out.println("Wednesday");
          break;
        case 5:
          System.out.println("Thursday");
          break;
        case 6:
          System.out.println("Friday");
          break;
        case 7:
          System.out.println("Saturday");
          break;
        default:
          System.out.println("Invalid input..."); // Handles invalid numbers
      }
      sc.close();
    }
  }
}
