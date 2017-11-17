package chap4.threadpoolexecutor_6;

import chap4.threadpoolexecutor_6.myrunnable.MyRunnable1;
import chap4.threadpoolexecutor_6.mythreadfactory.MyThreadFactoryA;

import java.util.Date;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException{
        MyRunnable1 runnable = new MyRunnable1();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,99999,99999, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        executor.setThreadFactory(new MyThreadFactoryA());
        executor.execute(runnable);
    }



}
