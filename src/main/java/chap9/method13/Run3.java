package chap9.method13;


import chap9.method13.myrunnable.MyRunnable2;

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
        pool.shutdown();
        System.out.println("A= "+pool.awaitTermination(1,TimeUnit.SECONDS)+"  " +new Date());
        System.out.println("B= "+pool.awaitTermination(1,TimeUnit.SECONDS)+"  " +new Date());
    }

}
