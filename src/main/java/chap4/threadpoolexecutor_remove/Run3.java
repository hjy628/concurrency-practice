package chap4.threadpoolexecutor_remove;

import chap4.threadpoolexecutor_remove.myrunnable.MyRunnable;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run3 {

    public static void main(String[] args) throws InterruptedException{
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("打印了! beginA"+Thread.currentThread().getName());
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println("打印了! endA"+Thread.currentThread().getName());
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("打印了! beginB"+Thread.currentThread().getName());
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println("打印了! endB"+Thread.currentThread().getName());
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1,5, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        executor.submit(runnable1);
        executor.submit(runnable2);
        TimeUnit.SECONDS.sleep(1);
        executor.remove(runnable2);
        System.out.println("main end!");
    }



}
