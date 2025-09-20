
class A {
    public void fun() throws ClassNotFoundException {

        Class.forName("Calc");
    }

}


class Throws {
    public static void main(String args[]){

        A obj = new A();

        try {
            obj.fun();
        }
        catch (ClassNotFoundException e) {
            System.out.println("Class Not found." + e);
        }
    }
}
