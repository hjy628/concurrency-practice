package chap9.method16;



import chap9.method16.mytask.MyRecursiveTask1;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 */
public class Run1_2 {

    public static void main(String[] args) throws InterruptedException,ExecutionException{
        MyRecursiveTask1 task1 = null;
        ForkJoinPool pool = new ForkJoinPool();
        for (int i = 0; i < 50; i++) {
            task1 = new MyRecursiveTask1();
            pool.submit(task1);
        }
        TimeUnit.MILLISECONDS.sleep(50);
        System.out.println("并行数getParallelism："+pool.getParallelism()+"   线程池大小getPoolSize："+pool.getPoolSize()
        +" getQueuedSubmissionCount= "+pool.getQueuedSubmissionCount()+" hasQueuedSubmissions: "+pool.hasQueuedSubmissions());
       pool.shutdown();
        do {

        }while (!task1.isDone());

    }

}
