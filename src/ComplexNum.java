import java.util.Scanner;

public class ComplexNum {

  int real;
  int img;

  void input() {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the real part: ");
    real = in.nextInt();
    System.out.print("Enter the imaginary part: ");
    img = in.nextInt();
  }

  void display() {
    System.out.println("Equation is: " + real + " + i(" + img + ")\n");
  }

  void function(ComplexNum obj1, ComplexNum obj2) {
    int addreal = obj1.real + obj2.real;
    int addimg = obj1.img + obj2.img;
    System.out.println("Addition: " + addreal + " + i(" + addimg + ")");

    int subreal = obj1.real - obj2.real;
    int subimg = obj1.img - obj2.img;
    System.out.println("Subtraction: " + subreal + " + i(" + subimg + ")");

    int mulreal = ((obj1.real * obj2.real) - (obj1.img * obj2.img));
    int mulimg = ((obj1.real * obj2.img) + (obj1.img * obj2.real));
    System.out.println("Multiplication: " + mulreal + " + i(" + mulimg + ")");
  }

  public static void main(String[] args) {
    ComplexNum obj1 = new ComplexNum();
    obj1.input();
    obj1.display();

    ComplexNum obj2 = new ComplexNum();
    obj2.input();
    obj2.display();

    ComplexNum obj3 = new ComplexNum();
    obj3.function(obj1, obj2);
  }
}
