import java.util.Scanner;

public class Add_num_userInput {
	public static void main(String[] args) {
		int x,y,z;
    //Here we take user input from scanner class
		Scanner sc= new Scanner(System.in);

    // nextInt() Stores integer type value in variable
		System.out.print("Entet the first number:");
		x = sc.nextInt();   // First input

		System.out.print("Entet the second number:");
		y = sc.nextInt();   // Second input

		z = x + y;
		System.out.println("Addition of " +x +" and " +y +" is:"+z);
		sc.close();
	}
}
