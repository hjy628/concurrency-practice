package chap2.countdownlatch_test1.service;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-14.
 */
public class MyService {

    private CountDownLatch latch = new CountDownLatch(1);

    public void testMethod(){
        try {
            System.out.println("A");
            latch.await(3, TimeUnit.SECONDS);
            System.out.println("B");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void downMethod(){
        System.out.println("X");
        latch.countDown();
    }


}
