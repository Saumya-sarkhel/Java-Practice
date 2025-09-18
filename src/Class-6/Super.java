/*
    'super()' will call the constructor of the super class.
    'this()' will execute the constructor of the same class.
*/

// Every class is java extends Object class
class A extends Object {

    public A() {
        // By default, the first statement in every constructor is a method called a super() method.
        super();
        System.out.println("In A block");
    }
    public A(int n) {
        // super();

        this(); // 'this()' will execute the constructor of same class

        System.out.println("In A int");
    }
}
class B extends A {

    public B() {
        // By default, the first statement in every constructor is a method called a super() method.
        super();// calls the default constructor of super class

        System.out.println("In B block");
    }
    public B(int n) {
        super(n); // calls the parameterised constructor of super class
        System.out.println("In B int block");
    }
}

public class Super {
    public static void main(String[] args) {

        B obj = new B();
    }
}
