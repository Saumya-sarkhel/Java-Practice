import java.util.Scanner;

public class Ternary_operator {

  public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);

		System.out.print("Enter 3 number:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int max;

		if(x==y&&y==z)
    {
			System.out.println("All Numbers are equal");
		}
		else
		{
			max = (x>y) ? ((x>z) ? x:z) : ((y>z) ? y:z); // Ternarty Operation
			System.out.println("Maximum is: "+max);
		}
		sc.close();
	}
}
