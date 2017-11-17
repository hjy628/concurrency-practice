package chap4.threadpoolexecutor_2_shutdownnow;

import chap4.threadpoolexecutor_2_shutdownnow.myrunnable.MyRunnable;
import chap4.threadpoolexecutor_2_shutdownnow.myrunnable.MyRunnable2;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run3 {

    public static void main(String[] args) throws InterruptedException{
        MyRunnable2 runnable = new MyRunnable2();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,99999,9999L, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        TimeUnit.SECONDS.sleep(1);
        executor.shutdownNow();
        executor.execute(runnable);
        System.out.println("main end");
    }



}
