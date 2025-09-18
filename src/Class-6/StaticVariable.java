/*
   # Use of static keyword
    = when we are using static keyword with variable, block, method it become independent of object.

    The static keyword in Java is used to create class-level variables and methods that belong to the class itself rather than to any specific instance of the class, meaning they are shared among all instances.
*/

class Mobile{

    String brand;   // Instance variable
    int price;     // Instance variable
    static String name; // Static variable

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(){ // Statuc Method
        // you can use a static var inside a static method.
        // "brand" & "price" will get warning.
        // Here which object is refered is not specified, Creates confusion.
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show2(Mobile obj){ // Statuc Method
        // Object reference is passed through parameter
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class StaticVariable{
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Mobile.name = "SmartPhone";

        Mobile.name = "Phone";

        obj1.show();
        obj2.show();

        // Can call a static method with help of Class names
        Mobile.show1();
        // Object reference is passed
        Mobile.show2(obj1);

    }
}
