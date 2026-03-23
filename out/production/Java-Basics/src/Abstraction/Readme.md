## Interface:-
In an abstract class, we can have both abstract methods as well as normal or concrete methods.
- If your class has only abstract methods then instead of using class, you can simply use an interface in place of it.
- Interface is not any class.
- Every method in an interface is public and abstract by default.
- Even if you do not use two keywords (public and abstract) with methods then also it will not give an error in an interface. By default, it will consider all methods as public and abstract.
- We cannot instantiate an interface.
- Interface only shows the design and it does not provide any implementation.
- To provide an implementation of methods, you need to create a class and instantiate it also.
e.g,
```java
 interface A
 {
  methods()
 }
```
## implements keyword:-
To implement an interface, we use the keyword - implements.
- If you use the implements keyword with class, then it is compulsory to give an implementation of all the methods that are defined in an interface.
- If you do not give an implementation of all methods then it will make your class an abstract class by default.
- So, to make a concrete class, you have to give the implementation of all methods present in an interface.

e.g.,
```java
  class B implements A{
    methods() {
        statement;
    }
    ----
  }
```
## Variables in an interface:-
- We can call the methods of an interface by creating an object of the class that implements an interface.
- We can also declare variables in an interface.
- All the variables in an interface are final and static by default.
- So, we first have to initialize the variables in an interface.
- As a variable is static in an interface, then you do not need to create an object for it. You can directly call the variable by using the interface name.
e.g., A.area;    (here, area is a variable initialized in an interface)
- As the variable is final, you can not change the value of that variable after initializing it once.

- Interface does not have its own memory in the heap.

## Interface uses:-
- Interface in Java is used to achieve abstraction.
- Interface is used to design an application to make it loosely coupled.
- implements keyword is used with a class to extend it to an interface
- We can also achieve multiple inheritance in Java, by using the interface.
- It is also used to achieve loose coupling.

# Abstraction in Object-Oriented Programming (OOP)

**Abstraction** is one of the four fundamental pillars of OOP. It is the process of hiding the complex internal implementation details of an object and exposing only the essential features to the user. Abstraction helps reduce complexity and allows the programmer to focus on interactions at a higher level.

---

## Key Points about Abstraction

- Abstraction hides **internal implementation complexity** and shows only necessary details.
- It emphasizes **what an object does**, not **how it does it**.
- It promotes code maintainability and reusability.
- In Java, abstraction is achieved using:
  - **Abstract Classes** (partial abstraction)
  - **Interfaces** (full abstraction)

---

## Achieving Abstraction in Java

### 1. Abstract Class

An abstract class is declared with the `abstract` keyword. It can have both abstract methods (without body) and concrete methods (with implementation). Abstract classes cannot be instantiated directly and must be extended.

### Example of Abstract Class

```java

// Abstract class Vehicle with an abstract method start()
abstract class Vehicle {
    abstract void start();  // Abstract method: no body

    void stop() {          // Concrete method
        System.out.println("Vehicle stopped.");
    }
}

// Car class extends Vehicle and provides implementation for start()
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started with key.");
    }
}

public class TestAbstraction {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();  // Calls Car's start()
        myCar.stop();   // Calls Vehicle's stop()
    }
}

```
> **Output:**
Car started with key.
Vehicle stopped.

###### An interface in Java is a blueprint of a class, containing only abstract methods (until Java 8's default and static methods). It allows the implementation of 100% abstraction. Classes implement interfaces using the `implements` keyword.
