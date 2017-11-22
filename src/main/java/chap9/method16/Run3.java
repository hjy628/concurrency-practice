package chap9.method16;


import chap9.method16.mytask.MyRecursiveTask3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

/**
 * Created by hjy on 17-11-22.
 */
public class Run3 {

    public static void main(String[] args) throws InterruptedException,ExecutionException{

        MyRecursiveTask3 task = new MyRecursiveTask3(1,900000);
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
