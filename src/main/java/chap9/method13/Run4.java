package chap9.method13;


import chap9.method13.myrunnable.MyRunnable1;
import chap9.method13.myrunnable.MyRunnable2;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 *
 */
public class Run4 {

    public static void main(String[] args) throws InterruptedException,ExecutionException{

        MyRunnable1 myRunnable1 = new MyRunnable1();
        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(myRunnable1);
        pool.shutdown();
        System.out.println(new Date());
        System.out.println(pool.awaitTermination(Integer.MAX_VALUE,TimeUnit.SECONDS)+"   "+new Date()+"　　全部任务执行完毕！　");
        System.out.println(new Date());
    }

}
