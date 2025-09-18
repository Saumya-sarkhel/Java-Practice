
import java.util.Scanner;

public class Cylinder extends Square {
    double height;

    Cylinder() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height:");
        this.height = sc.nextDouble();
    }

    double getVoloume() {
        double v;
        v = Math.PI * side * side * height;
        return v;
    }
}
