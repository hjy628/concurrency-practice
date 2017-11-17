package chap4.threadpoolexecutor_2;

import chap4.threadpoolexecutor_2.myrunnable.MyRunnable;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run1 {

    public static void main(String[] args) throws InterruptedException{
        MyRunnable runnable = new MyRunnable();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(7,10,0L, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        System.out.println("main end");
    }



}
