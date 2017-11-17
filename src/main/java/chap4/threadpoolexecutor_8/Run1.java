package chap4.threadpoolexecutor_8;


import chap4.threadpoolexecutor_8.myrunnable.MyRunnable1;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run1 {

    public static void main(String[] args) throws InterruptedException{

        ThreadPoolExecutor executor = new ThreadPoolExecutor(4,5,5, TimeUnit.SECONDS,new SynchronousQueue<>());
        System.out.println(executor.allowsCoreThreadTimeOut());

        for (int i = 0; i < 4; i++) {
            MyRunnable1 runnable = new MyRunnable1();
            executor.execute(runnable);
        }
        TimeUnit.SECONDS.sleep(8);

        System.out.println(executor.getPoolSize());
    }



}
