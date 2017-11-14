package chap1.semaphore_tryacquire_1.myservice;

import java.util.concurrent.Semaphore;

/**
 * Created by hjy on 17-11-14.
 */
public class MyService {

    private Semaphore semaphore = new Semaphore(1);

    public void testMethod(){
        if (semaphore.tryAcquire()){
            System.out.println("ThreadName="+Thread.currentThread().getName()+"首选进入!");
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String newString = new String();
                Math.random();
            }
            semaphore.release();
        }else {
            System.out.println("ThreadName="+Thread.currentThread().getName()+"未成功进入!");
        }
    }


}
