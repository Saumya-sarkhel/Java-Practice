
class Counter {
    int count;
    public synchronized void increment(){
        count++;
    }
    // 'synchronized' keyword tells java that this method will called ones at a time.
    // so if 't1' is calling it, then 't2' has to wait.
}

public class Mutation {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable obj1 = () ->
        {
            for(int i=1; i<=1000; i++)
            {
                c.increment();
            }
        };

        Runnable obj2 = () ->
        {
            for(int i=1; i<=1000; i++)
            {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        /*
            'join' is a special methods that allows your main thread to wait for
            other threads and join them together. still threads are unpredictable someties.

            It throws InterruptedException.
        */

        System.out.println(c.count);
    }
}
