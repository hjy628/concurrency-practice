package chap9.test5;


import chap9.test5.mytask.MyRecursiveTask;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 * 每个任务成功返回值为100,并且任务之间运行的方式是异步的，但join()方法却是同步的
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{
        ForkJoinPool pool = new ForkJoinPool();

        MyRecursiveTask task = new MyRecursiveTask(1,20);
        ForkJoinTask<String>  taskA = pool.submit(task);
        System.out.println( taskA.join() + " A: " +new Date());
        TimeUnit.SECONDS.sleep(5);
    }

}
