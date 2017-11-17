package chap4.threadpoolexecutor_remove;


import chap4.threadpoolexecutor_remove.myrunnable.MyRunnable;

import java.util.concurrent.LinkedBlockingDeque;
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
                    System.out.println("打印了! begin"+Thread.currentThread().getName());
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println("打印了! end"+Thread.currentThread().getName());
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1,100, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        executor.execute(runnable);
        TimeUnit.SECONDS.sleep(1);
        executor.remove(runnable);
        System.out.println("任务正在运行不能删除");
    }



}
