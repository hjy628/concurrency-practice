package chap2.countdownlatch_test3.extthread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-14.
 */
public class MyThread extends Thread{
    private CountDownLatch maxRunner;

    public MyThread(CountDownLatch maxRunner) {
        super();
        this.maxRunner = maxRunner;
    }

    @Override
    public void run() {
        try {
            System.out.println(maxRunner.getCount());
            TimeUnit.SECONDS.sleep(2);
            System.out.println("--"+maxRunner.getCount());
            maxRunner.countDown();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
