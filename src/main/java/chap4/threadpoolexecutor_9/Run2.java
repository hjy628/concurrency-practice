package chap4.threadpoolexecutor_9;


import chap4.threadpoolexecutor_9.myrunnable.MyRunnable1;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException{



        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("打印了！ begin "+Thread.currentThread().getName());
                    TimeUnit.SECONDS.sleep(4);
                    System.out.println("打印了！ end "+Thread.currentThread().getName());
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,2,5, TimeUnit.SECONDS,new LinkedBlockingDeque<>());
        System.out.println("线程池中的线程数A: "+executor.getPoolSize());
        System.out.println("启动核心线程数量为: "+executor.prestartAllCoreThreads());
        System.out.println("线程池中的线程数B: "+executor.getPoolSize());

    }



}
