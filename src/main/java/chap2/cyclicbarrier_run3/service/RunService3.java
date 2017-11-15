package chap2.cyclicbarrier_run3.service;

import java.util.Date;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by hjy on 17-11-15.
 */
public class RunService3 {

    private CyclicBarrier barrier = new CyclicBarrier(3, new Runnable() {
        @Override
        public void run() {
            System.out.println("彻底结束了　" + new Date());
        }
    });

    public void testMethod( ){
        try {
            System.out.println(Thread.currentThread().getName()+" 准备！  " + new Date() );
            if (Thread.currentThread().getName().equals("Thread-0")){
                System.out.println("thread-0执行了   barrier.await(5,TimeUnit.SECONDS)");
                barrier.await(5,TimeUnit.SECONDS);
            }
            if (Thread.currentThread().getName().equals("Thread-1")){
                System.out.println("thread-1执行了  barrier.await()");
                barrier.await();
            }


            System.out.println(Thread.currentThread().getName()+" 开始！  " + new Date() );

        }catch (InterruptedException e){
            System.out.println(Thread.currentThread().getName()+"进入了InterruptedException e "+barrier.isBroken());
            e.printStackTrace();
        }catch (BrokenBarrierException e){
            System.out.println(Thread.currentThread().getName()+"进入了BrokenBarrierException e "+barrier.isBroken());
            e.printStackTrace();
        }catch (TimeoutException e){
            System.out.println(Thread.currentThread().getName()+"TimeoutException e "+barrier.isBroken());
            e.printStackTrace();
        }
    }




}
