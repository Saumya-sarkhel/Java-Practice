/*

# Multiple inheritance:
= If a particular class inheriting multiple class then this type of inheritance is called multiple inheritance.
Note: But Java doesnot allow Multiple Inheritance , we have different method doing it.

# Why java not support multiple inheritance?
= Because of the Ambiguity problem, Java does not support multiple inheritances directly.

class A {..code}
class B {..code}
class C extends B, A {..code} // Not Possible
class C extends B and A {..code} // Not Possible

*/

class A {

}
class B {

}
class C extends A, B{ // Warning, Not possible

}

public class MultipleInheritance {
    public static void main(String[] args) {
        System.out.println("Hello, Java");
    }
}
