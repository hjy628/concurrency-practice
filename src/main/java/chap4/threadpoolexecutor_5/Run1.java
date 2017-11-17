package chap4.threadpoolexecutor_5;


import chap4.threadpoolexecutor_5.myrunnable.MyRunnable1;

import java.util.Date;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run1 {

    public static void main(String[] args) throws InterruptedException{
        MyRunnable1 runnable = new MyRunnable1();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,99999,99999, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        executor.execute(runnable);
        System.out.println(" main begin ! "+new Date());
        System.out.println(executor.awaitTermination(10,TimeUnit.SECONDS));
        System.out.println(" main end ! "+new Date());
        //此实验说明awaitTermination()方法具有阻塞特性
    }



}
