package chap4.threadpoolexecutor_1;

import java.util.Date;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run2_1 {

    //队列只用LinkedBlockingDeque类
    //并且线程数量<=corePoolSize
    //所以keepAliveTime>5时也不清除空闲线程

    public static void main(String[] args) throws InterruptedException{
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName()+" run!"+new Date());
                    TimeUnit.SECONDS.sleep(1);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        ThreadPoolExecutor executor = new ThreadPoolExecutor(7,8,5,TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());

        executor.execute(runnable); //1
        executor.execute(runnable); //2
        executor.execute(runnable); //3
        executor.execute(runnable); //4
        executor.execute(runnable); //5
        executor.execute(runnable); //6
        executor.execute(runnable); //7
        TimeUnit.MILLISECONDS.sleep(300);
        System.out.println("A:"+executor.getCorePoolSize());
        System.out.println("A:"+executor.getPoolSize());
        System.out.println("A:"+executor.getQueue().size());
        System.out.println("B:"+executor.getCorePoolSize());
        TimeUnit.SECONDS.sleep(10);
        System.out.println("B:"+executor.getPoolSize());
        System.out.println("B:"+executor.getQueue().size());
         //按钮呈红色，因为池中还有线程在等待任务

    }




}
