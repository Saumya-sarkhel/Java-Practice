
class A extends Thread {    // By Extend a Thread Class

    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("hi");
            try {
                Thread.sleep(10); // 10 milliseconds of waiting stage then prints the next
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class B extends Thread{     // By Extend a Thread Class

    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);  // 10 milliseconds of waiting stage then prints the next
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();

    }
}

/*      THREAD STATES
       ---------------

    New      -> Runnable =  start()
    Runnable -> Running  =  run()
    Running  -> Waiting  =  sleep() / wait()
    Waiting  -> Runnable =  notify()
    Runnig   -> Dead     =  stop()
    Runnable -> Dead     =  stop()

*/
