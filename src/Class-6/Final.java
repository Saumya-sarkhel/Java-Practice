// final - Variable, method , class

final class Calc {
    public final void show() {
        // final methods cannot be override
        System.out.println("In Calc show");
    }

    public void add(int a, int b){

        System.out.println(a+b);
    }
}

// final class cannot be extend
class AdvCalc extends Calc { } // WARNING


public class Final {
    public static void main(String[] args) {

        // Final variables cannot be changed
        final int num = 8;

        // num = 10; // Not possible

        System.out.println(num);

        Calc obj = new Calc();
        obj.show();
        obj.add(4, 5);
    }
}
