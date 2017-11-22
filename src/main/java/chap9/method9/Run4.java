package chap9.method9;


import chap9.method9.myrunnable.MyRunnable1;
import chap9.method9.myrunnable.MyRunnable2;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 *
 */
public class Run4 {

    public static void main(String[] args) throws InterruptedException,ExecutionException{

        MyRunnable2 myRunnable2 = new MyRunnable2();
        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(myRunnable2);
        TimeUnit.SECONDS.sleep(1);
        pool.shutdownNow(); //返回一个空的List
        pool.execute(myRunnable2);
        System.out.println("main end             "+new Date());
        TimeUnit.SECONDS.sleep(Integer.MAX_VALUE/1000);

        //shutdown:
        //每个人物正常运行直到结束
        //池关闭后不再允许有新任务被执行并抛出RejectedExecutionException异常.

        //shutdownNow结合isInterrupted()==true判断：
        //立即停止当前正在执行的任务
        //池关闭后不再允许有新任务被执行并抛出RejectedExecutionException异常.
        //shutdownNow未结合isInterrupted()==true判断：
        //每个任务正常运行直到结束
        //池关闭后不再允许有新任务被执行并抛出RejectedExecutionException异常.
    }

}
