import java.util.Scanner;

public class paisa {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double rs;
    System.out.print("Enter the price: ");
    rs = in.nextDouble();

    int  paise = (int)Math.round(rs * 100);
    System.out.println("The price in paisa is: %.2f" + paise);
  }
}
