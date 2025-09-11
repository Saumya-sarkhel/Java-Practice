// A class MyPoint, Two instance variables x(int) and y(int).,A default constructor,  A overloaded constructor, A method getData() to take values .

import java.util.Scanner;

class Mypoint {
    int x;
    int y;

    Mypoint() {
        this.x = 0;
        this.y = 0;
    }

    Mypoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinate x and y:");
        this.x = sc.nextInt();
        this.y = sc.nextInt();
    }

    static double linesegment(Mypoint m, Mypoint n) {
        double gradient = (n.y - m.y) / (double) (n.x - m.x);
        return gradient;
    }

}

public class TestMypoint {
    public static void main(String[] args) {

        Mypoint p1 = new Mypoint();
        Mypoint p2 = new Mypoint(5, 6);
        p1.getData();
        double g = Mypoint.linesegment(p1, p2);
        System.out.println("Gradient is:" + g);
    }
}
