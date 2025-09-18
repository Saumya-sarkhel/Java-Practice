/*

class - class -> extends
class - interface -> implements
interface - interface -> extends

*/

interface A {
    int age;
    void show();
    void run();
}
interface B {
    void hide();
}

// interface to interface
interface Y extends B {
    /*
    methods of interface B will be here also.
    so any class is implementing interface Y then it have to also define that method.
    */
}

// Multiple interface
class X implements A,B {

    public void show() {
        System.out.println("show method");
    }
    public void run(){
        System.out.println("running..");
    }
    public void hide() {
        System.out.println("hide method");
    }
}


public class Multiple_interfce {
    public static void main(String[] args) {

        /* reference of interface & object of class */
        // only interface A methods are accessible

        A obj = new X();
        obj.show();
        obj.run();

        /* to get interface B methods
        we have to create different object with reference B interface */

        B obj1 = new X();
        obj1.hide();


    }
}
