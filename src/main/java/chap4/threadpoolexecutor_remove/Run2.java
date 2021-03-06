package chap4.threadpoolexecutor_remove;

import chap4.threadpoolexecutor_remove.myrunnable.MyRunnable;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException{
        MyRunnable runnable = new MyRunnable();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(7,10,0L, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        executor.execute(runnable);
        System.out.println("main end");
    }



}
