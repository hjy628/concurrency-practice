package chap9.method10;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 * A=false
 B=false
 null
 C=true
 *
 * 使用shutdown()方法关闭pool池之前，isTerminating()方法的返回值一直是false
 */
public class Run1 {

    public static void main(String[] args) throws InterruptedException,ExecutionException{
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String newString = new String();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
            }
        };

        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask task = pool.submit(runnable);
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println("A="+pool.isTerminating());
        pool.shutdown();
        System.out.println("B="+pool.isTerminating());
        System.out.println(task.get());
        TimeUnit.SECONDS.sleep(1);
        System.out.println("C="+pool.isTerminated());

    }

}
