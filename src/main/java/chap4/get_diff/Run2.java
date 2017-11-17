package chap4.get_diff;

import chap4.get_diff.extthread.GMyThreadA;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-17.
 * getCompletedTaskCount()是取得有多少个线程已经执行完任务了
 * getCorePoolSize()是取得构造方法传入的corePoolSize参数值
 * getMaximumPoolSize()是取得构造方法传入的maximumpoolSize参数值
 * getPoolSize()是取得池中有多少个线程
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException{
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(5);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,5,100,TimeUnit.SECONDS,new SynchronousQueue<>(),new ThreadPoolExecutor.AbortPolicy());

        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        System.out.println(executor.getCompletedTaskCount());
        System.out.println("getPoolSize=" + executor.getPoolSize());
        TimeUnit.SECONDS.sleep(7);
        System.out.println(executor.getCompletedTaskCount());
        System.out.println("getCorePoolSize=" + executor.getCorePoolSize());
        System.out.println("getMaximumPoolSize=" + executor.getMaximumPoolSize());
    }


}
