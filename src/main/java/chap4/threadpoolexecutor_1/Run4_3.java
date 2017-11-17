package chap4.threadpoolexecutor_1;

import java.util.Date;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run4_3 {


    //队列只用SynchronousQueue类,也就是如果
    //线程数量>=corePoolSize
    //并且线程数量>maximumPoolSize
    //所以出现异常
    public static void main(String[] args) throws InterruptedException{

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName()+" run! "+new Date());
                    TimeUnit.SECONDS.sleep(1);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        ThreadPoolExecutor executor = new ThreadPoolExecutor(7,8,5,TimeUnit.SECONDS,new SynchronousQueue<>());

        executor.execute(runnable); //1
        executor.execute(runnable); //2
        executor.execute(runnable); //3
        executor.execute(runnable); //4
        executor.execute(runnable); //5
        executor.execute(runnable); //6
        executor.execute(runnable); //7
        executor.execute(runnable); //8
        executor.execute(runnable); //9
        TimeUnit.MILLISECONDS.sleep(300);
        System.out.println("A:"+executor.getCorePoolSize());
        System.out.println("A:"+executor.getPoolSize());
        System.out.println("A:"+executor.getQueue().size());
        System.out.println("B:"+executor.getCorePoolSize());
        TimeUnit.SECONDS.sleep(10);
        System.out.println("B:"+executor.getPoolSize());
        System.out.println("B:"+executor.getQueue().size());




    }

}
