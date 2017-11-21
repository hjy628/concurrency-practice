package chap8.scheduled_thread_pool_executor_9;

import chap8.scheduled_thread_pool_executor_9.myrunnable.MyrunnableA;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-21.
 *
 */
public class Run4 {

    public static void main(String[] args) throws InterruptedException{

        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(10);

        Runnable runnable1 = new MyrunnableA("A");

        ScheduledFuture future = executor.schedule(runnable1,1,TimeUnit.SECONDS);

        TimeUnit.SECONDS.sleep(3);
        System.out.println(future.cancel(false));
        System.out.println("main end");
    }


}
