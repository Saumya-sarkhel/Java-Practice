public class Static_1D_array {

  public static void main(String[] args) {

		//int arr[5]= {1,2,3,4,5};  //this is not allowed in java
		int arr[]= {1,2,3,4,5};   //this is possible

		int []arr2= {10,20,30,40};  //this is also possible
		//In java array index always start with zero

		System.out.print("Array 1 elements are:");
		for(int i=0;i<5;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\nArray 2 elements are:");

    //i can not be grater than 4 because our array element is 4 it is not possible to run the loop grater than array element
		for(int i=0;i<4;i++){
			System.out.print(arr2[i]+" ");
		}

	}
}
