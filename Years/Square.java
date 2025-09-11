import java.util.Scanner;

public class Square {
    double side;

    Square() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side:");
        this.side = sc.nextDouble();
    }
}
