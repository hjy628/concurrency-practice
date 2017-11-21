package chap8.scheduled_thread_pool_executor_6;

import chap8.scheduled_thread_pool_executor_6.myrunnable.MyrunnableA;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-21.
 *
 */
public class Run {

    public static void main(String[] args) {

        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(10);

        Runnable runnable1 = new MyrunnableA("A");
        Runnable runnable2 = new MyrunnableA("B");
        Runnable runnable3 = new MyrunnableA("C");
        Runnable runnable4 = new MyrunnableA("D");
        Runnable runnable5 = new MyrunnableA("E");

        System.out.println(runnable1.hashCode());
        System.out.println(runnable2.hashCode());
        System.out.println(runnable3.hashCode());
        System.out.println(runnable4.hashCode());
        System.out.println(runnable5.hashCode());


        executor.scheduleAtFixedRate(runnable1,10,2,TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(runnable2,10,2,TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(runnable3,10,2,TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(runnable4,10,2,TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(runnable5,10,2,TimeUnit.SECONDS);
        System.out.println("\n");

        BlockingQueue<Runnable> queue = executor.getQueue();
        Iterator<Runnable> iterator = queue.iterator();
        while (iterator.hasNext()){
            Runnable runnable = (Runnable) iterator.next();
            System.out.println("队列中的：　"+runnable);
        }


    }


}
