import java.util.Scanner;

public class area {
  public static void main(String[] args) {
    int choice;
    Scanner in = new Scanner(System.in);
    System.out.println("1. Rectangle \n2. Square \n3. Triangle\n4. Exit");
    System.out.print("Enter your choice: ");
    choice = in.nextInt();
    switch (choice) {
      case 1: { // Rectangle
        int len, wid, Area, peri;
        System.out.print("Enter the length of the rectangle: ");
        len = in.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        wid = in.nextInt();
        Area = len * wid;
        System.out.println("Area of the Rectangle is: " + Area);
        peri = 2 * (len + wid);
        System.out.println("Perimeter of the rectangle is: " + peri);
		break;
      }
      case 2: { // Square
        int side, area, peri;
        System.out.print("Enter length of side: ");
        side = in.nextInt();
        area = (side * side);
        System.out.println("The area of Square is: " + area);
        peri = 4 * side;
        System.out.println("The Perimeter of Square is: " + peri);
        break;
      }
      case 3: { // Traingle
        float s1, s2, s3, s, area, peri;
        System.out.print("Enter 1st side of triangle: ");
        s1 = in.nextFloat();
        System.out.print("Enter 2nd side of triangle: ");
        s2 = in.nextFloat();
        System.out.print("Enter 3rd side of triangle: ");
        s3 = in.nextFloat();
        s = (s1 + s2 + s3) / 2;
        area = (float) Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
        System.out.println("The Area of triangle is: " + String.format("%.2f", area));
        peri = s1 + s2 + s3;
        System.out.println("The Perimeter is: " + String.format("%.2f", peri));
        break;
      }
      case 4: {
        System.out.println("Operation terminated.");
        System.exit(1);
      }
      default: {
        System.out.println("Invalid optinon.");
        return;
      }
    }
  }
}
