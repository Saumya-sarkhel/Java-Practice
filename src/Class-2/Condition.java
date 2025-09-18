import java.util.Scanner; // Import Scanner class for user input

public class Condition {
  	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		System.out.print("Enter the age:");
		int age=sc.nextInt();

    // Basic If-Else Program
		if(age>=18){
			System.out.println("You can Vote");
		}
		else{
			System.out.println("You can't Vote");
		}
    // Close the scanner to free resources
    sc.close();
	}
}
