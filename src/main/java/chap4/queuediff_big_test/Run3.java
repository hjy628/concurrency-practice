package chap4.queuediff_big_test;

import chap4.queuediff_big_test.myrunnable.MyRunnable;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-17.
 */
public class Run3 {

    public static void main(String[] args) throws InterruptedException{
        //ArrayBlockingQueue 使用带参构造
        //max值被参考

        LinkedBlockingDeque linked = new LinkedBlockingDeque<Runnable>();

        System.out.println(linked.size());

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,3,5, TimeUnit.SECONDS,linked);
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());

        System.out.println(executor.getPoolSize()+" - "+linked.size());

        //使用new LinkedBlockingDeque<Runnable>();无参构造，capacity值是Integer.MAX_VALUE
        //有一个任务被拒绝


    }

}
