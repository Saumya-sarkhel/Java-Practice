
class A {
    int age;

    public void show(){
        System.out.println("In show");
    }

    // Inner class inside class A
    class B {
        public void config(){
            System.out.println("In B config");
        }
    }

    // static inner class inside class A
    static class C {
        public void run(){
            System.out.println("Running in C");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        /*
        to access class inside class this is this is the way.
        You can call the method of class B by using the dot operator in between both classes A and B
        */
        A.B obj1 = obj.new B();
        obj1.config();

        /*
        When an inner class is declared as static, then you do not need to create an object for it.
        */
        A.C obj2 = new A.C();
        obj2.run();
    }

}
