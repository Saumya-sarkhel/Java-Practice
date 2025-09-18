
// An abstract method can only be defined by an abstract class
abstract class Car {  // abstract class

    // abstract class to declare a method
    public abstract void drive();

    public void playMusic() {
        System.out.println("Play music");
    }
}

/* If you are extending an abstract class then the class must
implement the inherited abstract method Car.drive() */
class Toyota extends Car {  // concrete class

    public void drive() {
        System.out.println("Driving..");
    }
}

public class Abstract {
    public static void main(String[] args) {

        /*  You can't create object of an abstract class */
        // Car obj = new Car(); // Not applicable

        Car obj = new Toyota();

        obj.drive();
        obj.playMusic();
    }
}
