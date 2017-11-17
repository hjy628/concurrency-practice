package chap4.threadpoolexecutor_after_before;


import chap4.threadpoolexecutor_after_before.executor.MyThreadPoolExecutor;
import chap4.threadpoolexecutor_after_before.myrunnable.MyRunnable1;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run1 {

    public static void main(String[] args) throws InterruptedException{

        MyThreadPoolExecutor executor = new MyThreadPoolExecutor(2,2,Integer.MAX_VALUE,
                TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());

        executor.execute(new MyRunnable1("A1"));
        executor.execute(new MyRunnable1("A2"));
        executor.execute(new MyRunnable1("A3"));
        executor.execute(new MyRunnable1("A4"));
    }



}
