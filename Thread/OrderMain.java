package Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OrderMain {
    public static void main(String[] args) throws InterruptedException {

        /*
         * OrderMatic oMatic = new OrderMatic();
         * Thread t1 = new Thread(oMatic);
         * t1.start();
         * t1.join();
         * 
         * Thread t2 = new Thread(oMatic);
         * t2.start();
         * t2.join();
         * }
         * System.out.println(oMatic.getOrderNo());
         */

        /*
         * OrderMatic oMatic = new OrderMatic();
         * List<Thread> islemler = new ArrayList<>();
         * 
         * for (int i = 0; i < 100; i++) {
         * Thread t = new Thread(oMatic);
         * islemler.add(t);
         * t.start();
         * //t.join();
         * 
         * }
         * System.out.println(oMatic.getOrderNo());
         */

        OrderMatic oMatic = new OrderMatic();
        ExecutorService pool = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            pool.execute(oMatic);
            
        }
        System.out.println(oMatic.getOrderNo());
    }
}
