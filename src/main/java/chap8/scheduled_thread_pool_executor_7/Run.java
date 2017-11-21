package chap8.scheduled_thread_pool_executor_7;

import chap8.scheduled_thread_pool_executor_7.myrunnable.MyrunnableA;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-21.
 *
 */
public class Run {

    public static void main(String[] args) {

        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);

        Runnable runnable1 = new MyrunnableA("A");
        Runnable runnable2 = new MyrunnableA("B");

        executor.schedule(runnable1,3,TimeUnit.SECONDS);
        executor.shutdown();
        System.out.println("已经shutdown了");
    }


}
