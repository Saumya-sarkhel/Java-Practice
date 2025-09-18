
public class WrapperClass {
    public static void main(String[] args) {

        int num = 7;

        // premitive type to object type
        Integer num1 = num;     // autoboxing
        System.out.println(num1);

        // object type to premitive type
        int num2 = num1.intValue(); // auto-unboxing

        System.out.println(num2);


        String str = "12";
        // Integer from a string
        int num3 = Integer.parseInt(str);

        System.out.println(num3 * 2);
    }
}
