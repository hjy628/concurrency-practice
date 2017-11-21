package chap8.scheduled_thread_pool_executor_9;

import chap8.scheduled_thread_pool_executor_9.myrunnable.MyrunnableA;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-21.
 *
 */
public class Run1_Ext {

    public static void main(String[] args) throws InterruptedException{

        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(10);

        Runnable runnable1 = new MyrunnableA("A");
        //第二个参数为0则任务不放入队列中马上运行
        ScheduledFuture future = executor.schedule(runnable1,0,TimeUnit.SECONDS);
        TimeUnit.SECONDS.sleep(2);
        BlockingQueue<Runnable> queue = executor.getQueue();
        System.out.println("Ａ处size()="+queue.size());
        System.out.println("取消结果为："+future.cancel(true));
        queue = executor.getQueue();
        System.out.println("B处size()="+queue.size());
        System.out.println("main end");
    }


}
