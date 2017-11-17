package chap4.queuediff_big_test;

import chap4.queuediff_big_test.myrunnable.MyRunnable;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-17.
 */
public class ArrayBlockingQueueRun1 {

    public static void main(String[] args) throws InterruptedException{
        //ArrayBlockingQueue 使用带参构造
        //max值被参考

        ArrayBlockingQueue array = new ArrayBlockingQueue<Runnable>(2);

        System.out.println(array.size());

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,3,5, TimeUnit.SECONDS,array);
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());

        System.out.println(executor.getPoolSize()+" - "+array.size());

        //放入队列2个任务，执行3个任务

    }

}
