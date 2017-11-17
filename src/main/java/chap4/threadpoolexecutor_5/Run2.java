package chap4.threadpoolexecutor_5;

import chap4.threadpoolexecutor_5.myrunnable.MyRunnable1;

import java.util.Date;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException{
        MyRunnable1 runnable = new MyRunnable1();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,99999,99999, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        executor.execute(runnable);
        executor.shutdown();
        System.out.println(" main begin ! "+new Date());
        System.out.println(executor.awaitTermination(10,TimeUnit.SECONDS));
        System.out.println(" main end ! "+new Date());
        //代码awaitTermination(10,TimeUnit.SECONDS)作用：
        //最多等待10秒，也就是阻塞１０秒
    }



}
