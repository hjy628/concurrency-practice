package chap4.get_diff;

import chap4.get_diff.extthread.GMyThreadA;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-17.
 * getPoolSize()获得当前线程池里面有多少个线程，这些线程数包括正在执行任务的线程，也包括正在休眠的线程
 * getActiveCount()获得正在执行任务的线程数
 */
public class Run1 {

    public static void main(String[] args) throws InterruptedException{
        GMyThreadA a = new GMyThreadA();

        SynchronousQueue queue = new SynchronousQueue();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,5,5, TimeUnit.SECONDS,queue);

        executor.execute(a);
        executor.execute(a);
        executor.execute(a);
        System.out.println(executor.getActiveCount()+" ----- "+executor.getPoolSize());
        TimeUnit.SECONDS.sleep(7);
        System.out.println(executor.getActiveCount()+" ----- "+executor.getPoolSize());
    }


}
