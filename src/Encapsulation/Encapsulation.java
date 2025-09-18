class Human{

    // private access modifires , cannot be accessed outside class
    private int age;
    private String name;

    // get() and set() method to access from outside.
    // we are encapsulating data into methods, which is the only way to access from outside
    public int getAge(){  // getter
        return age;
    }

    public void setAge(int a){ // setter
        age = a;
    }

    public String getName(){  // getter
        return name;
    }

    public void setName(String n){ // setter
        name = n;
    }

}

public class Encapsulation {
    public static void main(String[] args) {

        Human obj = new Human();

        // Valus passing through get() and set()
        obj.setAge(30);
        obj.setName("Java");


        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
