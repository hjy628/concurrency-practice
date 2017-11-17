package chap4.threadpoolexecutor_4;


import chap4.threadpoolexecutor_4.myrunnable.MyRunnable;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run1 {

    public static void main(String[] args) throws InterruptedException{
        MyRunnable runnable = new MyRunnable();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,99999,99999, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        System.out.println(executor.isTerminating()+" "+executor.isTerminated());
        executor.shutdown();
        TimeUnit.SECONDS.sleep(1);
        System.out.println(executor.isTerminating()+" "+executor.isTerminated());
        TimeUnit.SECONDS.sleep(1);
        System.out.println(executor.isTerminating()+" "+executor.isTerminated());
        TimeUnit.SECONDS.sleep(1);
        System.out.println(executor.isTerminating()+" "+executor.isTerminated());
        TimeUnit.SECONDS.sleep(1);
        System.out.println(executor.isTerminating()+" "+executor.isTerminated());
        TimeUnit.SECONDS.sleep(1);
        System.out.println(executor.isTerminating()+" "+executor.isTerminated());
    }



}
