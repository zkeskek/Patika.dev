package Thread;

public class Threads {
    public static void main(String[] args) throws InterruptedException {
        Counter c1 = new Counter("Counter-1");
        Counter c2 = new Counter("Counter-2");

        // c1.start();
        // c2.start();

        CounterR cr1 = new CounterR("Cr1", 1);
        Thread t1 = new Thread(cr1);
        CounterR cr2 = new CounterR("Cr2", 1);
        Thread t2 = new Thread(cr2);
        t1.start();
        Thread.sleep(5000);
        cr1.stop();

        
        t2.start();
        Thread.sleep(2000);
        cr2.stop();
       

    }

}
