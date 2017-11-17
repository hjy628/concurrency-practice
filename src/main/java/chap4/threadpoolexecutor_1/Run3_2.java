package chap4.threadpoolexecutor_1;

import java.util.Date;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run3_2 {


    //队列只用SynchronousQueue类,
    //并且线程数量>corePoolSize时将其余的任务放入池中,总数为8
    //由于运行的线程数为8,数量上>coorPoolSize为7的值
    //所以keepAliveTime>5时清除空闲线程
    //如果使用SynchronousQueue类则maximunPoolSize参数作用将有效

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
        TimeUnit.MILLISECONDS.sleep(300);
        System.out.println("A:"+executor.getCorePoolSize());
        System.out.println("A:"+executor.getPoolSize());
        System.out.println("A:"+executor.getQueue().size());
        System.out.println("B:"+executor.getCorePoolSize());
        TimeUnit.SECONDS.sleep(10);
        System.out.println("B:"+executor.getPoolSize());
        System.out.println("B:"+executor.getQueue().size());
        //按钮呈红色，因为池中还有线程在等待任务
        //删除的是>corePoolSize的多余线程




    }

}
