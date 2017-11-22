package chap9.method8;



import chap9.method8.myrunnable.MyRunnable;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 * 调用shutdown()方法后任务依然运行，，直到结束
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException,ExecutionException{

        MyRunnable myRunnable = new MyRunnable();
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(myRunnable);
        TimeUnit.SECONDS.sleep(1);
        pool.shutdown();
        System.out.println("main end             "+new Date());
        TimeUnit.SECONDS.sleep(Integer.MAX_VALUE/1000);
    }

}
