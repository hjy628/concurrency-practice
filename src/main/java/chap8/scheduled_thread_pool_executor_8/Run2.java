package chap8.scheduled_thread_pool_executor_8;

import chap8.scheduled_thread_pool_executor_8.myrunnable.MyrunnableA;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-21.
 *
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException{
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);

        Runnable runnable1 = new MyrunnableA("A");
        Runnable runnable2 = new MyrunnableA("B");

        executor.scheduleAtFixedRate(runnable1,1,2,TimeUnit.SECONDS);
        executor.setContinueExistingPeriodicTasksAfterShutdownPolicy(true);
        executor.shutdown();
        System.out.println("已经shutdown了");

    }


}
