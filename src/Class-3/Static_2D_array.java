import java.util.Scanner;

public class Static_2D_array {

  public static void main(String[] args) {
		//int a[3][4];    //this is not possible in java
		Scanner sc=new Scanner(System.in);
		int i,j;
		int a[][] =new int [2][3]; // This is the way to declare static 2-d array

		for(i=0;i<2;i++){
			for(j=0;j<3;j++){
				System.out.print("A["+i+"]["+j+"]= ");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("\nArray elements are:");
		for(i=0;i<2;i++){
			for(j=0;j<3;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}
}
