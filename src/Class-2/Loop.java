
public class Loop {

  public static void main(String[] args) {

		// for loop (Entry Control Loop)
    // In a for loop, the condition is checked before entering the loop body.
    // If the condition is false at the start, the loop body will not execute.
    System.out.println("Printing through For Loop:");
		for(int i=1;i<=5;i++){
			System.out.println(i);
		}

		// while loop (Entry Control Loop)
    // In a while loop, the condition is checked before entering the loop body.
    // If the condition is false at the start, the loop body will not execute.
    System.out.println("Printing through While Loop:");
		int j=1;
		while(j<=5){
			System.out.println(j);
			j++;
		}

		// Do-while loop (Exit Control Loop)
    // In a do-while loop, the loop body is executed at least once before the condition is checked.
    // Even if the condition is false initially, the loop body will execute once.
    System.out.println("Printing through Do-While Loop:");
		int k=1;
		do {
			System.out.println("Even the condition is false this is printing");
		}while(k<=0);//this condition is flase but the print statement is printing

	}
}
