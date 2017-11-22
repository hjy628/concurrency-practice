package chap9.join_get;


import chap9.join_get.mytask.MyRecursiveTask;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 * 使用方法get()在出现异常时进入catch()
 */
public class Run {

    public static void main(String[] args) {
        try {
        MyRecursiveTask task1 = new MyRecursiveTask();
        System.out.println(task1.hashCode());
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask task2 = pool.submit(task1);
        System.out.println(task2.hashCode() + " " +task2.get());
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
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("进入了mainA");
        }catch (ExecutionException e){
            e.printStackTrace();
            System.out.println("进入了mainB");
        }
        System.out.println("main end");

    }

}
