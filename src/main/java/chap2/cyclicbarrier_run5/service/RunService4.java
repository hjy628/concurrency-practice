package chap2.cyclicbarrier_run5.service;

import java.util.Date;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-15.
 */
public class RunService4 {

    public CyclicBarrier barrier = new CyclicBarrier(3, new Runnable() {
        @Override
        public void run() {
            System.out.println("彻底结束了　" + new Date());
        }
    });

    public void testMethod( ){
        try {
            System.out.println(Thread.currentThread().getName()+" 准备！  " + new Date() );
            barrier.await();
            System.out.println(Thread.currentThread().getName()+" 结束！  " + new Date() );

        }catch (InterruptedException e){
            System.out.println(Thread.currentThread().getName()+"进入了InterruptedException e "+barrier.isBroken());
            e.printStackTrace();
        }catch (BrokenBarrierException e){
            System.out.println(Thread.currentThread().getName()+"进入了BrokenBarrierException e "+barrier.isBroken());
            e.printStackTrace();
        }
    }




}
