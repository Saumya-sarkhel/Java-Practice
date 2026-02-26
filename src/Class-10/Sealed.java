/*
    'sealed' is a keyword used in java helps you to restrict your class or interface
    to be extended with.

    'sealed' used before a class or interface will restrict that class,
    no other class can't extend it unless the parent class permits it.
*/

// Class
sealed class A extends Thread implements Cloneable permits B,C {
    // Allows Class B & C to extends, but not D & E.
    // class A can also extend other classes and implements other interfaces, permits always stays at last.
}

final class B extends A {
    // final class cannot be extended by any other class.
    // A class extending any sealed class either have to final, sealed or non-sealed.
}

non-sealed class C extends A {
    // non-sealed class can be extend by other class as class-E is doing.
}

final class D extends A {
   // ERROR: class is not allowed to extend sealed class:
   // A (as it is not listed in its 'permits' clause)
}

class E extends C {
    // class E can extends class C as its non-sealed but as its extending a sealed class A
    // class A(sealed) -> class C(non-sealed) -> class E(optional)
}

// Interface
sealed interface X permits Y {
    // sealed also works for interfaces
}

non-sealed interface Y extends X {
    // interface Y extends interface X also have to be sealed/non-sealed.(interface cannot be final)
}

public class Sealed {
    public static void main(String[] args) {

    }
}
