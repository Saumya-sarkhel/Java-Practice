
public class TryCatch {
    public static void main(String[] args) {

        int i=0;
        int j=0;

        int num[] = new int[5];

        String str = null;

        try {
            /* 1st exception: ArithmeticException */
            j = 10/i;

            /*  2nd exception: ArrayIndexOutOfBoundsException */
            System.out.println(num[5]);

            /*  3rd exception: NullPointer (will handle by 'Exception' block) */
            System.out.println(str.length());

        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in array limit");
        }
        catch(Exception e){ // parent class should be at the end
            System.out.println("Someting went wrong: "+ e);
        }

        System.out.println("Bye");
    }
}
