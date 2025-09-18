// Base class (superclass)
class Calc {

    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int sub(int n1, int n2){
        return n1 - n2;
    }
}

// 'AdvCalc' class extending base class 'Calc'
class AdvCalc extends Calc {

    public int multi(int n1, int n2){
        return n1 * n2;
    }
    public int div(int n1, int n2){
        return n1 / n2;
    }
}

// 'ScientificCalc' class extending 'AdvCalc'
// This shows Multilevel Inheritance: Calc → AdvCalc → ScientificCalc
class ScientificCalc extends AdvCalc {

    public double power(int n1, int n2){
        return Math.pow(n1, n2);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {

        // Creating object of lowest-level subclass
        ScientificCalc obj = new ScientificCalc();

        // Using inherited methods from Calc
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(7, 3);

        // Using subclass-specific methods from AdvCalc
        int r3 = obj.multi(5, 3);
        int r4 = obj.div(15, 5);

        // Using method from ScientificCalc
        double r5 = obj.power(2, 3);

        // Printing results
        System.out.println(r1 + " : " + r2);
        System.out.println(r3 + " : " + r4);
        System.out.println(r5);
    }
}
