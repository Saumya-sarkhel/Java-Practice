import java.util.Scanner;

class Box {
    int length, breadth, height;

    Box(Box ob) {
        this.length = ob.length;
        this.breadth = ob.breadth;
        this.height = ob.height;
    }

    Box() {
        this.length = 0;
        this.breadth = 0;
        this.height = 0;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length,breadth and height");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();
    }

    int Volume() {
        int vol = length * breadth * height;
        return vol;
    }
}
public class BoxDemo {
    public static void main(String[] args) {

        Box b = new Box();
        b.input();
        Box b1 = new Box(b);
        System.out.println("Volume is:" + b1.Volume());
    }

}
