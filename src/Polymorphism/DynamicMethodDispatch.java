class A {
    public void show(){
        System.out.println("In A show");
    }
}
class B extends A {
    public void show(){
        System.out.println("In B show");
    }
}
class C extends A {
    public void show(){
        System.out.println("In C show");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {

        A obj = new A(); // Calling for A
        obj.show();

        obj = new B(); // Object now refering to B
        obj.show();

        obj =  new C(); // Object now refering to C
        obj.show();

        // This will only work if a class is extending anothe class
    }
}
