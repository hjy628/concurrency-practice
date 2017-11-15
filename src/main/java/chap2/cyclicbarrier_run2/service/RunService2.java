package chap2.cyclicbarrier_run2.service;

import java.util.Date;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-15.
 */
public class RunService2 {

    private CyclicBarrier barrier;

    public RunService2(CyclicBarrier barrier) {
        super();
        this.barrier = barrier;
    }


    public void beinRun(int count){
        try {
            System.out.println(Thread.currentThread().getName()+" 到了，在等待其他人都到了开始起跑  " );
            if (Thread.currentThread().getName().equals("Thread-2")){
                System.out.println("thread-2进来了");
                TimeUnit.SECONDS.sleep(5);
              //  Integer.parseInt("a");
                Thread.currentThread().interrupt();
            }
            barrier.await();
            System.out.println("都到了，开始跑!");
            System.out.println(Thread.currentThread().getName()+"到达终点，并结束第"+count+"赛段");

        }catch (InterruptedException e){
            System.out.println(Thread.currentThread().getName()+"进入了InterruptedException e "+barrier.isBroken());
            e.printStackTrace();
        }catch (BrokenBarrierException e){
            System.out.println(Thread.currentThread().getName()+"进入了BrokenBarrierException e "+barrier.isBroken());
            e.printStackTrace();
        }
    }

    public void testA(){
        //比赛1个赛段
        for (int i = 0; i < 1; i++) {
            beinRun(i+1);
        }
    }


}
