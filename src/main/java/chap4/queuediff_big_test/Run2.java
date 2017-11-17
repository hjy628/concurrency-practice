package chap4.queuediff_big_test;

import chap4.queuediff_big_test.myrunnable.MyRunnable;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-17.
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException{
        //LinkedBlockingDeque 使用带参构造
        //max值被参考
        //但队列容量不够，有一个任务出现异常

        LinkedBlockingDeque linked = new LinkedBlockingDeque<Runnable>(2);

        System.out.println(linked.size());

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,3,5, TimeUnit.SECONDS,linked);
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());

        System.out.println(executor.getPoolSize()+" - "+linked.size());

        //放入队列2个任务，执行3个任务
        //有一个任务被拒绝


    }

}
