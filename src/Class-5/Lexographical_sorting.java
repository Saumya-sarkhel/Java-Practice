import java.util.Scanner;

public class Lexographical_sorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of string: ");
		int n = sc.nextInt();
		sc.nextLine();

		String s[]=new String [n];

		for(int i = 0 ;i < s.length; i++)
		{
			s[i] = sc.nextLine();
		}

		for(int i = 0; i < n - 1; i++){
			for(int j = 0; j < n - i - 1 ; j++){
				if(s[j].compareTo(s[j+1])>0)
				{
					String temp = s[j];
					s[j] = s[j+1];
					s[j+1] = temp;
				}
			}
		}
		System.out.println("After sorting string are:");
		for(int k = 0; k < n ; k++){
			System.out.println(s[k]);
		}
        sc.close();
	}
}
