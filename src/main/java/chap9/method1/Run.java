package chap9.method1;

import chap9.method1.action.MyRecursiveAction;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 * public void execute(ForkJoinTask<?> task) 以异步的方式执行任务
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{
        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(new MyRecursiveAction());
        TimeUnit.SECONDS.sleep(5);
    }

}
