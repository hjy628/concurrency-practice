package chap9.method3;


import chap9.method3.mytask.MyRecursiveTask;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 * public void execute(ForkJoinTask<?> task) 虽然无返回值，但还是可以通过RecursiveTask对象处理返回值
 */
public class Run {

    public static void main(String[] args) throws InterruptedException,ExecutionException{
        MyRecursiveTask task = new MyRecursiveTask();
        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(task);
        //execute方法无返回值
        //想要取得返回值得通过RecursiveTask对象
        System.out.println(new Date());
        System.out.println(task.get());
        System.out.println(new Date());
        TimeUnit.SECONDS.sleep(5);
    }

}
