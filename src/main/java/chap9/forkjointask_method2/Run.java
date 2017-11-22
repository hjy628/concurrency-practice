package chap9.forkjointask_method2;

import chap9.forkjointask_method2.mytask.MyRecursiveTask;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * Created by hjy on 17-11-22.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{
        MyRecursiveTask task = new MyRecursiveTask();
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask task1 = pool.submit(task);
        System.out.println(task1.isCompletedAbnormally()+"  "+task1.isCompletedNormally());
        System.out.println(task1.getException());
    }

}
