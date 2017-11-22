package chap9.forkjoin_3;


import chap9.forkjoin_3.mytask.MyRecursiveTask;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

/**
 * Created by hjy on 17-11-22.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException,ExecutionException{
        MyRecursiveTask task = new MyRecursiveTask(1,10);
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(task);
        System.out.println("结果值为:"+task.get());
    }

}
