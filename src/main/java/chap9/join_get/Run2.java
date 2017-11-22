package chap9.join_get;


import chap9.join_get.mytask.MyRecursiveTask;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 * 方法join()遇到异常直接抛出
 */
public class Run2 {

    public static void main(String[] args) {

            MyRecursiveTask task1 = new MyRecursiveTask();
            System.out.println(task1.hashCode());
            ForkJoinPool pool = new ForkJoinPool();
            ForkJoinTask task2 = pool.submit(task1);
            System.out.println(task2.hashCode() + " " +task2.join());
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String newString = new String();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
            }

        System.out.println("main end");
    }

}
