package chap9.test3;


import chap9.test3.mytask.MyRecursiveTask;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException{
        MyRecursiveTask task1 = new MyRecursiveTask();
        System.out.println(task1.hashCode());
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask task2 = pool.submit(task1);
        System.out.println(task2.hashCode() + " " +task2.join());
        TimeUnit.SECONDS.sleep(5);
    }

}
