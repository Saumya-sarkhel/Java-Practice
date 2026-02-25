
class A implements Runnable {   // Runnable Interface method

    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class B implements Runnable{    // Runnable Interface method

    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {

        Runnable obj1 = new A();
        Runnable obj2 = new B();    // reference of an Interface and object of an class

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        /*
            Runnable interface will not have thread methods,
            So we need to create seperate objects to use the features.
            We are passing Runnable objects in Thread class.
        */

        t1.start();
        t2.start();

    }
}
