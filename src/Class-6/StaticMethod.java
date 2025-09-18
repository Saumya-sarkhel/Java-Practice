class Mobile{

    String brand;
    int price;  // Instance variable
    // Static variable;
    static String name; // Common variable for all objects

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class StaticMethod{
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone"; /* Static variable are called with class name not objects name, No WARNING */

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        obj2.name = "SmartPhone"; // WARNING

        /*
        Changes the name SmartPhone -> phone.
        As name is Static thus it will also change for obj1 & obj2.
        Static variable is shared by all the objects. */
        Mobile.name = "Phone";

        obj1.show();
        obj2.show();
    }
}
