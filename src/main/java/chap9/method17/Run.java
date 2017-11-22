package chap9.method17;

import chap9.method17.mytask.MyRecursiveTask1;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{
        MyRecursiveTask1 task = new MyRecursiveTask1();

        ForkJoinPool pool = new ForkJoinPool();
        System.out.println(pool.isQuiescent());
        pool.submit(task);
        TimeUnit.SECONDS.sleep(1);
        System.out.println(pool.isQuiescent());

    }

}
