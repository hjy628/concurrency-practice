package chap4.threadpoolexecutor_9;


import chap4.threadpoolexecutor_9.myrunnable.MyRunnable1;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run1 {

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
        System.out.println("Z1= "+executor.prestartCoreThread());
        System.out.println("线程池中的线程数B: "+executor.getPoolSize());
        System.out.println("Z2= "+executor.prestartCoreThread());
        System.out.println("线程池中的线程数C: "+executor.getPoolSize());
        System.out.println("Z3= "+executor.prestartCoreThread());   //无效代码
        System.out.println("Z4= "+executor.prestartCoreThread());   //无效代码
        System.out.println("Z5= "+executor.prestartCoreThread());   //无效代码
        System.out.println("Z6= "+executor.prestartCoreThread());   //无效代码
        System.out.println("线程池中的线程数D: "+executor.getPoolSize());

    }



}
