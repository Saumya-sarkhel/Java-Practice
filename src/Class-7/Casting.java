class A {
    public void show1() {
        System.out.println("In A show");
    }
}

class B extends A {
    public void show2() {
        System.out.println("In B show");
    }
}

public class Casting {
    public static void main(String[] args) {

        // Upcasting
        // Reference of 'A' -- and Object of 'B'
        A obj = new B();
        obj.show1();

        // Downcasting
        // Explicitly casting the superclass reference back to the subclass type (B)
        B obj1 = (B) obj;
        obj1.show2();
    }
}
