package chap4.threadpoolexecutor_3;

import chap4.threadpoolexecutor_3.myrunnable.MyRunnable;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run4 {

    public static void main(String[] args) throws InterruptedException{
        MyRunnable runnable = new MyRunnable();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(7,99999,9999L, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        TimeUnit.SECONDS.sleep(1);
        executor.shutdown();
        executor.execute(runnable);
        System.out.println("main end");
    }



}
