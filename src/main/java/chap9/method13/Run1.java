package chap9.method13;


import chap9.method13.myrunnable.MyRunnable1;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 * 返回false表示任务池并没有被销毁
 */
public class Run1 {

    public static void main(String[] args) throws InterruptedException,ExecutionException{
        MyRunnable1 myRunnable1 = new MyRunnable1();
        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(myRunnable1);
        System.out.println("main begin             "+new Date());
        System.out.println(pool.awaitTermination(10,TimeUnit.SECONDS));
        System.out.println("main end             "+new Date());
       //此实验说明awaitTermination()方法具有阻塞特性
    }

}
