package chap4.queuediff_big_test;

import chap4.queuediff_big_test.myrunnable.MyRunnable;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-17.
 */
public class SynchronousQueueRun2 {

    public static void main(String[] args) throws InterruptedException{


        SynchronousQueue linked = new SynchronousQueue<Runnable>();

        System.out.println(linked.size());

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,3,5, TimeUnit.SECONDS,linked);
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());

        System.out.println(executor.getPoolSize()+" - "+linked.size());

        //直接执行3个任务

    }

}
