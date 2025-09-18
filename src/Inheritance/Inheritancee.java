
// Base class (superclass)
class Calc {

    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int sub(int n1, int n2){
        return n1 - n2;
    }
}

// Class 'AdvCalc' is extending from class 'Calc'
// Derived class (subclass)
class AdvCalc extends Calc{

    public int multi(int n1, int n2){
        return n1 * n2;
    }
    public int div(int n1, int n2){
        return n1/n2;
    }
}


public class Inheritancee {
    public static void main(String[] args) {
        /*
            Creating an object of AdvCalc allows access to both
            basic methods inherited from Calc (add, sub)
            and advanced methods defined in AdvCalc (multi, div)
        */

        AdvCalc obj = new AdvCalc();

        // Using inherited methods from Calc
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(7, 3);

        // Using subclass specific methods from AdvCalc
        int r3 = obj.multi(5, 3);
        int r4 = obj.div(15, 5);

        System.out.println(r1 + " : " + r2);
        System.out.println(r3 + " : " + r4);
    }
}
