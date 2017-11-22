package chap9.method16;


import chap9.method13.myrunnable.MyRunnable1;
import chap9.method16.mytask.MyRecursiveTask2;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException,ExecutionException{

        MyRecursiveTask2 task = new MyRecursiveTask2(1,900000);
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(task);
        do {
           System.out.println("getParallelism："+pool.getParallelism()+" getPoolSize："+pool.getPoolSize()
                   +" getQueuedSubmissionCount: "+pool.getQueuedSubmissionCount()+
                   " hasQueuedSubmissions: "+pool.hasQueuedSubmissions()
           +" getActiveThreadCount: "+pool.getActiveThreadCount()+" getQueuedTaskCount: "+pool.getQueuedTaskCount()
           +" getStealCount: "+pool.getStealCount()+" getRunningThreadCount: "+pool.getRunningThreadCount());
       }while (!task.isDone());
    }

}
