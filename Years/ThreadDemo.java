// Write a program to create two threads, one prints 'Hello' and other prints 'Hi'.

class Thread1 extends Thread {

    public void run() {

        System.out.println("Hello");

        // for(int i=0;i<5;i++)
        // {
        // System.out.println("Hello");
        //
        // try {
        // Thread.sleep(1000);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // }

    }

}

class Thread2 extends Thread {
    public void run() {

        System.out.println("Hi");

        // for(int i=0;i<5;i++)
        // {
        // System.out.println("Hi");
        //
        // try {
        // Thread.sleep(1000);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // }

    }
}
public class ThreadDemo {
    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();

    }
}
