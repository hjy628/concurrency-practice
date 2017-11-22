package chap9.method9;


import chap9.method9.myrunnable.MyRunnable1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 * 调用shutdown()方法后任务依然运行，，直到结束
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException,ExecutionException{

        MyRunnable1 myRunnable1 = new MyRunnable1();
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(myRunnable1);
        TimeUnit.SECONDS.sleep(2);
        pool.shutdownNow();
        pool.submit(myRunnable1);
    }

}
