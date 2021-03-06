package chap4.threadpoolexecutor_5;

import chap4.threadpoolexecutor_5.myrunnable.MyRunnable2;

import java.util.Date;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run3 {

    public static void main(String[] args) throws InterruptedException{
        MyRunnable2 runnable = new MyRunnable2();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,99999,99999, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.shutdown();
        System.out.println("A="+executor.awaitTermination(1,TimeUnit.SECONDS)+ "  " + new Date());
        System.out.println("B="+executor.awaitTermination(1,TimeUnit.SECONDS)+ "  " + new Date());
        System.out.println("C="+executor.awaitTermination(1,TimeUnit.SECONDS)+ "  " + new Date());
        System.out.println("D="+executor.awaitTermination(1,TimeUnit.SECONDS)+ "  " + new Date());
        System.out.println("E="+executor.awaitTermination(1,TimeUnit.SECONDS)+ "  " + new Date());
        System.out.println("F="+executor.awaitTermination(1,TimeUnit.SECONDS)+ "  " + new Date());
        System.out.println("G="+executor.awaitTermination(1,TimeUnit.SECONDS)+ "  " + new Date());
    }



}
