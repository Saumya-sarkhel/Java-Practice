## What is encapsulation ?
Binding data with method to make your program secure is known as encapsulation.
onsider encapsulation as we have capsule and inside capsule everything inside a class is wrapped or encapsulated.
e.g
```java
class A { private int a;
    public void setA(int num){a=num;}
    public int getA(){return a;}
}
```
here you can see that we can bind data with method inside a curly braces, it seems look like a capsule inside everything is present.

## How to achieve encapsulation ?
Through access specifiers private,protected,public,default. We can achieve encapsulation.

## Benefit of encapsulation
1. Helpful in to achieve abstraction
2. for security point of view it is most beneficial.
3. you can maintain log file through method when you bind your data with method.

## How to use private data ?
using setters and getters method we can set and get the value of variable.
```java
private int num;
public int getNum( ){
    return num;
}
public void setNum(int num){
    this.num=num;
}
```
## Note:
Always make variable as private and method as public to achieve  security in program.

## Access modifiers:

|                       | public | protected | default | private |
| --------------------- |:------: | :---------: | :-------: | :-------: |
| *Class*               | +      | +         | +       | +       |
| *Package*             | +      | +         | +       |         |
| *Subclass (same pkg)* | +      | +         | +       |         |
| *Subclass (diff pkg)* | +      | +         |         |         |
| *World*               | +      |           |         |         |

**Example of :**
```java
// Class encapsulating employee details
class Employee {
    // Private variables - hidden from outside access
    private String name;
    private int age;

    // Public setter methods to set the values
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;  // Validation inside setter
        }
    }

    // Public getter methods to get the values
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class TestEncapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();

        // Setting values via setters
        emp.setName("Alice");
        emp.setAge(30);

        // Getting values via getters
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
    }
}


```
> **Output:**
Employee Name: Alice
Employee Age: 30
