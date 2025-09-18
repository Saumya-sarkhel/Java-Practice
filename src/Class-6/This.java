/*

Instance variable:- These variables are declared within a class but outside a method.
These variables are created when we create an object and are destroyed when the object is destroyed.

Local variable:- These variables are declared within a method but do not get any default value.
They are created when we enter a method or constructor and get destroyed when the call returns from the method.


This keyword:-
   - This keyword represents the current object.
   - Current object is an object which is calling the method.
   - This keyword is used to invoke the current class constructor.
   - Using the 'this' keyword, we can return the current class instance.
   - This keyword can be used as an argument in the constructor call.
   - this() helps calling the constructor of same class.
*/

class Human{

    private int age; // here 'age' is Instance variable
    private String name;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        // here 'age' is local variable
        // here local variable will get preference

        this.age = age;

        // 'this' is a keyword that represents current object which is calling the method
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}

public class This {
    public static void main(String[] args) {

        Human obj = new Human();

        obj.setAge(30);
        obj.setName("Java");


        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
