/*
abstract class Computer {
    public abstract void code(); // abstract class
}
*/

//abstract class using 'interface'
interface Computer {
    void code();
}

// Desktop the prototype
class Desktop implements Computer {
    public void code(){
        System.out.println("Code in Desktop");
    }
}
// Laptop the prototype
class Laptop implements Computer {
    public void code(){
        System.out.println("Code is Laptop");
    }
}

class Developer {
    // taking reference of 'Computer' as argument
    public void devApp(Computer comp){
        /*
         when call code it will based on what object you are passing.
         either 'Laptop' or 'Desktop'
        */
        comp.code();
    }
}
public class Abstract {
    public static void main(String[] args) {

        // reference of interface and object of sub-class
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer Suraj = new Developer();
        Developer Nitin = new Developer();

        Suraj.devApp(desk); // Desktop
        Nitin.devApp(lap);  // Laptop
    }
}
