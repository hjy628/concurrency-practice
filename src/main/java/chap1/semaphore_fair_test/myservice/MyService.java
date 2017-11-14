package chap1.semaphore_fair_test.myservice;

import java.util.concurrent.Semaphore;

/**
 * Created by hjy on 17-11-14.
 */
public class MyService {
   // private boolean isFair = false;
    private boolean isFair = true;
    private Semaphore semaphore = new Semaphore(1,isFair);

    public void testMethod(){
        try {
            semaphore.acquire();
            System.out.println("ThreadName"+Thread.currentThread().getName());
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
    }
}
