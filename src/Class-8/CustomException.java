/*
    Custom exception: create a class name it and extend with 'Exception'
    that takes string as argument.
    Excepting has a constructor that takes 'string'
    so call the super class constructor using 'super()'


    Important Notes:
    -- we can create a custom exception by extending the 'Throwable' class in Java
    -- we can create a custom exception by extending the 'Exception' class in Java
    -- we can create a custom exception by extending  the Exception class or one of its subclasses, such as 'RuntimeException'.
*/

class MyOwnException extends Exception{
    public MyOwnException(String str) {
        super(str);
    }
}

public class CustomException {
    public static void main(String[] args) {

        int i=20;
        int j=0;

        try {
            j = 18/i;
            if(j==0)     // throw My custom exception
                throw new MyOwnException("Don't divide by zero");
        }
        catch (MyOwnException e) { // catches my custom exception
            j = 18/1;
            System.out.println("Thats the deafult output: "+ e);
        }
        catch(Exception e){
            System.out.println("Someting went wrong: "+ e);
        }

        System.out.println(j);

        System.out.println("Bye");
    }
}
