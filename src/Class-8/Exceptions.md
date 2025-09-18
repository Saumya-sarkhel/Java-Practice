## Java Exception Handling

### In java three types of errors that can occur during the execution of a program
1. compile time error
2. logical error
3. run time error -- this can be called as Exception

### 1. Compile-time errors
Compile-time errors are errors that occur during the compilation of the Java code. These errors are caused by syntax errors, missing semicolons, or incorrect variable names, among other things. If there are compile-time errors in your Java program, it cannot be compiled into bytecode, and it cannot be executed.

### 2. Logical errors
Logical errors are errors that occur when the program runs correctly, but it does not produce the expected output. These errors occur because of a mistake in the program's logic. For example, if a program is supposed to add two numbers but instead multiplies them, it will produce the wrong output. Logical errors are more difficult to detect than compile-time errors because the program runs without any error messages.

### 3. Exceptions(Runtime error)
Exceptions are errors that occur during the execution of the Java program.
Exceptions occur when something unexpected happens, such as trying to read from a file that does not exist or dividing by zero. When an exception occurs, the program will terminate unless the exception is handled by an exception handler.

#### In Exception we have Checked and Unchecked Exception this topic is discussed in Exception hierarachy:

### a) Checked Exception
Checked exceptions are exceptions that the Java compiler requires you to handle or declare.
These exceptions are checked at compile time, and you must either handle the exception with a try-catch block or declare it with a throws clause.
If you do not handle or declare a checked exception, the code will not compile. Checked exceptions are typically related to input/output operations,
such as file handling or network communication.

### b) Unchecked Exception
unchecked exceptions are exceptions that are not checked at compile time. These exceptions are typically caused by programming errors, such as null pointer exceptions, array index out of bounds exceptions, and class cast exceptions. Unchecked exceptions are not required to be handled or declared, but they can still occur during runtime.

### Important:
both checked and unchecked exceptions can occur during runtime, but checked exceptions are checked at compile time and require handling or declaring, while unchecked exceptions are not checked at compile time and do not require handling or declaring.



### Important points
- Every class extends Object class so, Throwable class by default extends Object
- The top-level class in the Java exception hierarchy is the Throwable class. All exception classes in Java are subclasses of the Throwable class.
- The Throwable class has two subclasses: Error and Exception.
- The Error class represents serious errors that cannot be handled by the program, such as OutOfMemoryError or StackOverflowError.
- The Exception class represents exceptions that can be caught and handled by the program.
- The Exception class has many subclasses that represent specific types of exceptions. Some common subclasses of Exception include RuntimeException, IOException, SQLException, and NullPointerException.
- Exception classes in Java can be either checked or unchecked.

### Checked Exception:
Checked exceptions are those that are checked at compile-time, meaning the compiler ensures that the programmer handles the exception by either catching or declaring it in the method signature using the throws keyword.
Examples of checked exceptions include IOException, SQLException, and ClassNotFoundException.

### UnChecked Exception:
Unchecked exceptions are not checked at compile-time, and the compiler does not force the programmer to handle them.
Examples of unchecked exceptions include NullPointerException, ArrayIndexOutOfBoundsException, and ArithmeticException.

## Java Exception Hierarchy

![Java Logo](https://media.geeksforgeeks.org/wp-content/uploads/20241218154434430661/Exception-Handling-768.png)

![Java Logo](https://media.geeksforgeeks.org/wp-content/uploads/20240730174225/Exceptions-in-Java-1-768.webp)


### Checked Exceptions
Checked exceptions are called compile-time exceptions because these exceptions are checked at compile-time by the compiler. Examples of Checked Exception are listed below:

- ClassNotFoundException: Throws when the program tries to load a class at runtime but the class is not found because it's belong not present in the correct location or it is missing from the project.
- InterruptedException: Thrown when a thread is paused and another thread interrupts it.
- IOException: Throws when input/output operation fails.
- InstantiationException: Thrown when the program tries to create an object of a class but fails because the class is abstract, an interface or has no default constructor.
- SQLException: Throws when there is an error with the database.
- FileNotFoundException: Thrown when the program tries to open a file that does not exist.

### Unchecked Exceptions

The unchecked exceptions are just opposite to the checked exceptions. The compiler will not check these exceptions at compile time. In simple words, if a program throws an unchecked exception and even if we did not handle or declare it, the program would not give a compilation error. Examples of Unchecked Exception are listed below:

- ArithmeticException: It is thrown when there is an illegal math operation.
- ClassCastException: It is thrown when we try to cast an object to a class it does not belong to.
- NullPointerException: It is thrown when we try to use a null object (e.g. accessing its methods or fields).
- ArrayIndexOutOfBoundsException: This occurs when we try to access an array element with an invalid index.
- ArrayStoreException: This happens when we store an object of the wrong type in an array.
- IllegalThreadStateException: It is thrown when a thread operation is not allowed in its current state.


> **Checked exceptions** must be handled at compile-time;
> **Unchecked exceptions** occur at runtime and do not require explicit handling.


### Try-Catch Block
A try-catch block in Java is a mechanism to handle exception. The try block contains code that might thrown an exception and the catch block is used to handle the exceptions if it occurs.

```java
try {
    // Code..
}
catch (ExceptionType e) {
    // Code..
}

```
### throw keyword:
**throw** keyword in Java is used to explicitly throw an exception.
When an exception is thrown using the throw keyword, the execution of the current method is stopped.

syntax-
```java
throw new NullPointerException("Object is null");
```
- **`throw`** keyword is used to throw exceptions, not to catch them. To catch exceptions, you need to use a try-catch block.
- If you do not use try-catch then the control is passed, where the method is called.
- when you want to pass message to an exception then you should use the parametrized constructor instead non parameterized constructor

```java
class Main{
   public static void main(String []args){
      int a=0;
      try{
         if(a==0)
// throw new ArithmeticException() is non parametrized constructor
throw new ArithmeticException("a should not be zero");
      }
      catch(ArithmeticException e){
         System.out.println("Exception caught: "+e);
      }

   }
}
```
> **Output**: Exception caught: java.lang.ArithmeticException: a should not be zero
