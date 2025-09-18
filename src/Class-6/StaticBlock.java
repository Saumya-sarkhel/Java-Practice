
class Mobile{
    String brand;
    int price;
    static String name; // Static variable

    // Static block, calls only once but
    // Static block is called first even before constructor
    static{
        name = "Phone";
        System.out.println("In Static block");
    }

    // Everytime object is created , constructor is called
    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("In constructor block");
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }


}

public class StaticBlock{
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone";


        Mobile obj2 = new Mobile();

    }
}
