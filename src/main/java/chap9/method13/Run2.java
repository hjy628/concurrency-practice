package chap9.method13;


import chap9.method13.myrunnable.MyRunnable1;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 * 日志main begin 和main end 之间的时间差差4秒,返回值打印ｔｒｕｅ,代表任务池在4秒后被销毁，
 * 所以awaitTermination(long timeout, TimeUnit unit)要结合shutdown()方法进行使用
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException,ExecutionException{

        MyRunnable1 myRunnable1 = new MyRunnable1();
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(myRunnable1);
        pool.shutdown();
        System.out.println("main begin             "+new Date());
        System.out.println(pool.awaitTermination(10,TimeUnit.SECONDS));
        System.out.println("main end             "+new Date());
        //代码awaitTermination(10,TimeUnit.SECONDS)作用：
        //最多等待十秒，也就是阻塞十秒
    }

}
