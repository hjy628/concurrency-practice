package chap9.method4;


import chap9.method4.mytask.MyRecursiveTask;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 * 方法execute()无返回值，submit()有返回值
 * public <T>ForkJoinTask<T>  submit(ForkJoinTask<?> task)
 */
public class Run {

    public static void main(String[] args) throws InterruptedException,ExecutionException{
        MyRecursiveTask task = new MyRecursiveTask();
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<String> returnTask =  pool.submit(task);
        System.out.println("begin"+new Date());
        System.out.println(task.get());
        System.out.println("end"+new Date());
        TimeUnit.SECONDS.sleep(5);
    }

}
