import java.util.Scanner;

class Square {
    double side;

    Square(double side) {
        this.side = side;
    }

    double getVolume() {
        double volume = side * side * side;
        System.out.println("Volume of Square (cube) is: " + volume);
        return volume;
    }
}

class Cylinder extends Square {
    double height;

    Cylinder(double side, double height) {
        super(side);
        this.height = height;
    }

    @Override
    double getVolume() {
        double volume = Math.PI * side * side * height;
        System.out.println("Volume of Cylinder is: " + volume);
        return volume;
    }
}

public class VolumeDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        double side = sc.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = sc.nextDouble();

        Square square = new Square(side);
        square.getVolume();

        Cylinder cylinder = new Cylinder(side, height);
        cylinder.getVolume();

        sc.close();
    }
}
