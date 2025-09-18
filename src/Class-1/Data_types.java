import java.util.Scanner; // Import Scanner class for user input

public class Data_types {

  public static void main(String[] args) {

    // Declare variables of different data types
    int a; // Integer variable
    float b; // Float variable
    double c; // Double variable
    char d; // Character variable
    long e; // Long integer variable
    short f; // Short integer variable
    byte g; // Byte variable
    boolean h; // Boolean variable

    // Create Scanner object to read input from user
    Scanner sc = new Scanner(System.in);

    // Prompt and read an integer value
    System.out.print("Enter Integer(A):");
    a = sc.nextInt();

    // Prompt and read a float value
    System.out.print("Enter float(B):");
    b = sc.nextFloat();

    // Prompt and read a double value
    System.out.print("Enter Double(C):");
    c = sc.nextDouble();

    // Prompt and read a character value
    System.out.print("Enter Char(D):");
    d = sc.next().charAt(0);

    // Prompt and read a long value
    System.out.print("Enter Long(E):");
    e = sc.nextLong();

    // Prompt and read a short value
    System.out.print("Enter Short(F):");
    f = sc.nextShort();

    // Prompt and read a byte value
    System.out.print("Enter Byte(G):");
    g = sc.nextByte();

    // Prompt and read a boolean value (true/false)
    System.out.print("Enter Boolean(H):");
    h = sc.nextBoolean();

    // Display all the entered values
    System.out.println("A=" + a);
    System.out.println("B=" + b);
    System.out.println("C=" + c);
    System.out.println("D=" + d);
    System.out.println("E=" + e);
    System.out.println("F=" + f);
    System.out.println("G=" + g);
    System.out.println("H=" + h);

    // Close the scanner to free resources
    sc.close();
  }
}
