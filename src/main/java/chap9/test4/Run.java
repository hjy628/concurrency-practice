package chap9.test4;


import chap9.test4.mytask.MyRecursiveTaskA;
import chap9.test4.mytask.MyRecursiveTaskB;

import java.util.Date;
import java.util.concurrent.ExecutionException;
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
        ForkJoinTask<Integer>  taskA = pool.submit(new MyRecursiveTaskA());
        ForkJoinTask<Integer>  taskB = pool.submit(new MyRecursiveTaskB());
        System.out.println("准备打印: "+ new Date());
        System.out.println( taskA.join() + " A: " +new Date());
        System.out.println( taskB.join() + " B: " +new Date());
        TimeUnit.SECONDS.sleep(5);
    }

}
