
/*

'interface' is not a class so it has to be implemented by ohter class .
by default every method in interface is 'public abstract'.

*/

interface A {
    int age = 21; // by default 'final' & 'static'

    public abstract void show();
    void config();
}
/*
class B implements interface A
its necessery to define all methods of interface inside class B, or else it will also be an 'abstract class'
*/
class B implements A {

    public void show(){
        System.out.println("In show");
    }
    public void config(){
        System.out.println("In config");
    }
}

public class Interface {
    public static void main(String[] args) {

        /*  you can't create object of A(interface), but create for B */
        A obj = new B();

        obj.show();
        obj.config();

        System.out.println(A.age);

    }
}
