package chap1.semaphore_acquireuninterruptibly_2.service;

import java.util.concurrent.Semaphore;

/**
 * Created by hjy on 17-11-14.
 */
public class Service {
    private Semaphore semaphore = new Semaphore(1);

    public void testMethod(){
            semaphore.acquireUninterruptibly();
            System.out.println(Thread.currentThread().getName()+" begin timer"+System.currentTimeMillis());
            for (int i = 0; i < Integer.MAX_VALUE / 50; i++) {
                String newSring = new String();
                Math.random();
            }
            System.out.println(Thread.currentThread().getName()+"   end timer"+System.currentTimeMillis());
            semaphore.release();
    }
}
