
import java.util.Scanner;

public class Vechicle implements FunctionVehicle {
    int speed, gear;

    public void speedUp(int value) {

        speed = speed + value;
    }

    public void changeGear(int value) {

        gear = value;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial Speed:");
        speed = sc.nextInt();
        System.out.println("Enter initial Gear:");
        gear = sc.nextInt();

    }

    public void display() {
        System.out.println("Speed:" + speed + "\nGear:" + gear);
    }

    public static void main(String[] args) {
        Vechicle v = new Vechicle();
        v.input();
        v.speedUp(80);
        v.changeGear(4);
        v.display();

    }

}
