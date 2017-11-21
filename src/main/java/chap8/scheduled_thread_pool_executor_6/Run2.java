package chap8.scheduled_thread_pool_executor_6;

import chap8.scheduled_thread_pool_executor_6.myrunnable.MyrunnableA;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-21.
 *
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException{

        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);

        Runnable runnable1 = new MyrunnableA("A");
        Runnable runnable2 = new MyrunnableA("B");
        ScheduledFuture future1 = executor.scheduleAtFixedRate(runnable1,0,2,TimeUnit.SECONDS);
        TimeUnit.SECONDS.sleep(1);
        ScheduledFuture future2 = executor.scheduleAtFixedRate(runnable2,10,2,TimeUnit.SECONDS);
        TimeUnit.SECONDS.sleep(5);

        //注意：remove()方法的参数是ScheduledFuture数据类型
        System.out.println(executor.remove((Runnable) future2));
        System.out.println("\n");


        BlockingQueue<Runnable> queue = executor.getQueue();
        Iterator<Runnable> iterator = queue.iterator();
        while (iterator.hasNext()){
            Runnable runnable = (Runnable) iterator.next();
            System.out.println("队列中的：　"+runnable);
        }


    }


}
