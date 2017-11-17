package chap4.threadpoolexecutor_6;

import chap4.threadpoolexecutor_6.myrunnable.MyRunnable2;
import chap4.threadpoolexecutor_6.mythreadfactory.MyThreadFactoryA;
import chap4.threadpoolexecutor_6.mythreadfactory.MyThreadFactoryB;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run4 {

    public static void main(String[] args) throws InterruptedException{
        MyRunnable2 runnable = new MyRunnable2();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,99999,99999, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        executor.setThreadFactory(new MyThreadFactoryB());
        executor.execute(runnable);
    }



}
