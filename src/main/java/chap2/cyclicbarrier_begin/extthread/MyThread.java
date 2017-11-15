package chap2.cyclicbarrier_begin.extthread;

import java.util.Date;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-14.
 */
public class MyThread extends Thread{
    private CyclicBarrier cyclicBarrier;

    public MyThread(CyclicBarrier cyclicBarrier) {
        super();
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep((int)Math.random());
            System.out.println(Thread.currentThread().getName()+"到了"+new Date());
            cyclicBarrier.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (BrokenBarrierException e){
            e.printStackTrace();
        }
    }
}
