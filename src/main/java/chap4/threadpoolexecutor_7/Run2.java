package chap4.threadpoolexecutor_7;

import chap4.threadpoolexecutor_7.executionhandler.MyRejectedExecutionHandler;
import chap4.threadpoolexecutor_7.myrunnable.MyRunnable1;
import chap4.threadpoolexecutor_7.mythreadfactory.MyThreadFactoryA;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException{
        MyRunnable1 runnable1 = new MyRunnable1("中国1");
        MyRunnable1 runnable2 = new MyRunnable1("中国2");
        MyRunnable1 runnable3 = new MyRunnable1("中国3");
        MyRunnable1 runnable4 = new MyRunnable1("中国4");

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,3,9999, TimeUnit.SECONDS,new SynchronousQueue<>());
        executor.setRejectedExecutionHandler(new MyRejectedExecutionHandler());
        executor.execute(runnable1);
        executor.execute(runnable2);
        executor.execute(runnable3);
        executor.execute(runnable4);
    }



}
