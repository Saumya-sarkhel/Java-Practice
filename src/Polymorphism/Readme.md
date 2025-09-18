# Polymorphism

Polymorphism means "many forms" — the ability of an object to be represented in multiple ways.

#### Types of Polymorphism:

1. **Compile Time / Static Polymorphism**:
   Achieved by **method overloading**, where multiple methods have the same name but different parameter lists (including multiple constructors).
   The compiler determines which method to call based on the method signature at compile time.

2. **Runtime / Dynamic Polymorphism**:
   Achieved by **method overriding**, where a subclass provides a specific implementation of a method already defined in its parent class.
   The method that gets called is determined at runtime depending on the object's actual type.

#### Method Overriding

- When the child class has a method with the same name and signature as a parent class method, this is **method overriding**.
- It allows the child class to provide its specific implementation of the method.
- Method overriding is a way to achieve **runtime polymorphism**.
- It helps increase the reusability and flexibility of code.

**Example:**:

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();  // Calls Dog's overridden method at runtime
    }
}
```
>**Output**:
Dog barks

#### Method Overloading

- Multiple methods in the same class have the same name but different parameters (different in number, type, or order).
- This is resolved at compile-time, hence called **compile-time polymorphism**.
- It increases readability by allowing the same method name to behave differently based on argument lists.

**Example:**

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}

public class Test {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 3));       // Calls int version
        System.out.println(calc.add(4.5, 3.2));   // Calls double version
    }
}
```
>**Output**:
8
7.7


#### Dynamic Method Dispatch

- It's the mechanism by which a call to an overridden method is resolved at runtime rather than compile-time.
- The reference variable's type can be a superclass while the actual object is an instance of the subclass.
- When the overridden method is called through the superclass reference, Java determines which version to invoke based on the object's type at runtime.

**Example:**

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.sound();  // Calls Dog's sound()

        a = new Cat();
        a.sound();  // Calls Cat's sound()
    }
}

```
