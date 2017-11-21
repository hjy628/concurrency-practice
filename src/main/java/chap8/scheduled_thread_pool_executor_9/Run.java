package chap8.scheduled_thread_pool_executor_9;

import chap8.scheduled_thread_pool_executor_9.myrunnable.MyrunnableA;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-21.
 *
 */
public class Run {

    public static void main(String[] args) {

        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(10);

        Runnable runnable1 = new MyrunnableA("A");

        ScheduledFuture future = executor.schedule(runnable1,1,TimeUnit.SECONDS);
        System.out.println(future.cancel(true));
        System.out.println("");

        BlockingQueue<Runnable> queue = executor.getQueue();
        Iterator<Runnable> iterator = queue.iterator();
        while (iterator.hasNext()){
            Runnable runnable = (Runnable)iterator.next();
            System.out.println("队列中的："+runnable);
        }
        System.out.println("main end");
    }


}
