package chap4.policy_discard_policy;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-17.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("打印了！ begin "+Thread.currentThread().getName());
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println("打印了！ end "+Thread.currentThread().getName());
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        ArrayBlockingQueue queue = new ArrayBlockingQueue(2);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,3,5,TimeUnit.SECONDS,queue,
                new ThreadPoolExecutor.DiscardPolicy());

        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        TimeUnit.SECONDS.sleep(8);
        System.out.println(executor.getPoolSize()+" - - " + queue.size()  );
    }

}
