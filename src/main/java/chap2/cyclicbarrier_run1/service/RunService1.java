package chap2.cyclicbarrier_run1.service;

import java.util.Date;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-15.
 */
public class RunService1 {

    private CyclicBarrier barrier;

    public RunService1(CyclicBarrier barrier) {
        super();
        this.barrier = barrier;
    }


    public void beinRun(){
        try {
            long sleepValue = (int) (Math.random()*10);
            TimeUnit.SECONDS.sleep(sleepValue);
            System.out.println(Thread.currentThread().getName()+" "+new Date()+" begin 跑第一阶段  " + barrier.getNumberWaiting()+1);
            barrier.await();
            System.out.println(Thread.currentThread().getName()+" "+new Date()+" end 跑第一阶段  " + barrier.getNumberWaiting());
            TimeUnit.SECONDS.sleep(sleepValue);
            System.out.println(Thread.currentThread().getName()+" "+new Date()+" begin 跑第二阶段  " + barrier.getNumberWaiting()+1);
            barrier.await();
            System.out.println(Thread.currentThread().getName()+" "+new Date()+" end 跑第二阶段  " + barrier.getNumberWaiting());

        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (BrokenBarrierException e){
            e.printStackTrace();
        }
    }


}
