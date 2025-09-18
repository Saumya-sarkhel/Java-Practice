
public class ExceptionDemo {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;

        // try-catch block to handle exception
        try{
            j = 18/i; //exception: divide by 0
        }
        catch(Exception e){ //handles all types of exception

            System.out.print("Got an error: ");
            System.out.println(e); // prints the cause of the exception
        }

        System.out.println(j);

        System.out.println("Bye.");
    }
}
