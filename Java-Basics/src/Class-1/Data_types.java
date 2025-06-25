import java.util.Scanner;

public class Data_types {

  public static void main(String[] args) {

		int a;
		float b;
		double c;
		char d;
		long e;
		short f;
		byte g;
		boolean h;

		Scanner sc= new Scanner(System.in);

		System.out.print("Enter Integer(A):");
		a=sc.nextInt();

		System.out.print("Enter float(B):");
		b=sc.nextFloat();

		System.out.print("Enter Double(C):");
		c=sc.nextDouble();

		System.out.print("Enter Char(D):");
		d=sc.next().charAt(0);

		System.out.print("Enter Long(E):");
		e=sc.nextLong();

		System.out.print("Enter Short(F):");
		f=sc.nextShort();

		System.out.print("Enter Byte(G):");
		g=sc.nextByte();

		System.out.print("Enter Boolean(H):");
		h=sc.nextBoolean();

		System.out.println("A="+a);
		System.out.println("B="+b);
		System.out.println("C="+c);
		System.out.println("D="+d);
		System.out.println("E="+e);
		System.out.println("F="+f);
		System.out.println("G="+g);
		System.out.println("H="+h);

    sc.close();
	}
}
