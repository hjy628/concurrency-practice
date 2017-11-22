package chap9.method6;


import chap9.method6.mycallable.MyCallable;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 * 传入Runnable接口虽然没有返回值，但调用get()方法呈阻塞状态
 */
public class Run {

    public static void main(String[] args) throws InterruptedException,ExecutionException{

        MyCallable callable= new MyCallable();


        ForkJoinPool pool = new ForkJoinPool();
        System.out.println("begin"+new Date());
        ForkJoinTask returnTask = pool.submit(callable);
        System.out.println(returnTask.get());
        System.out.println("end"+new Date());
        TimeUnit.SECONDS.sleep(5);
    }

}
