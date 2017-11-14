package chap1.semaphore_acquireuninterruptibly_1.service;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-14.
 */
public class Service {
    private Semaphore semaphore = new Semaphore(1);

    public void testMethod(){
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName()+" begin timer"+System.currentTimeMillis());
            for (int i = 0; i < Integer.MAX_VALUE / 50; i++) {
                String newSring = new String();
                Math.random();
            }
            System.out.println(Thread.currentThread().getName()+"   end timer"+System.currentTimeMillis());
            semaphore.release();

        }catch (InterruptedException e){
            System.out.println("线程"+Thread.currentThread().getName()+"进入了catch");
            e.printStackTrace();
        }
    }
}
