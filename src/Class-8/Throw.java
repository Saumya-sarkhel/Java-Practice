
public class Throw {
    public static void main(String[] args) {

        int i=20;
        int j=0;

        try {
            j = 18/i;
            if(j==0)
                throw new ArithmeticException("Don't divide by zero"); // throw an error and 'catch' take it
        }
        catch (ArithmeticException e) {
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
