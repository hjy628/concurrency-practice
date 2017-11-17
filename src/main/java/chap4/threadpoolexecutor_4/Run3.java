package chap4.threadpoolexecutor_4;

import chap4.threadpoolexecutor_4.myrunnable.MyRunnable;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run3 {

    public static void main(String[] args) throws InterruptedException{
        MyRunnable runnable = new MyRunnable();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(7,10,0L, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        executor.execute(runnable);
        executor.shutdown();
        System.out.println("main end");
    }



}
