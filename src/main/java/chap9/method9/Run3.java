package chap9.method9;


import chap9.method9.myrunnable.MyRunnable2;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 */
public class Run3 {

    public static void main(String[] args) throws InterruptedException,ExecutionException{

        MyRunnable2 myRunnable2 = new MyRunnable2();
        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(myRunnable2);
        TimeUnit.SECONDS.sleep(1);
        pool.shutdownNow();
        System.out.println("main end             "+new Date());
        TimeUnit.SECONDS.sleep(Integer.MAX_VALUE/1000);
    }

}
