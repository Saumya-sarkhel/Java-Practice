/*

Method Overriding is way to override the parent class method in child class .

-- method overriding is run time polymorphism.
-- it is use to increase the reusability of code.

*/

class A {
    public void show(){
        System.out.println("In A show");
    }
    public void config(){
        System.out.println("In A config");
    }
}
class B extends A {
    // Override the show method of A
    public void show(){
        System.out.println("In B show");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        B obj = new B();
        obj.show(); // print: In B show
        obj.config();
    }
}
