package chap2.cyclicbarrier_awaitafterreset_0.extthread;

import java.util.Date;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-14.
 */
public class ThreadAA extends Thread{
    private CyclicBarrier cyclicBarrier;

    public ThreadAA(CyclicBarrier cyclicBarrier) {
        super();
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        try {
            cyclicBarrier.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (BrokenBarrierException e){
            e.printStackTrace();
        }
    }
}
