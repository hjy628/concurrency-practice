package chap9.method8;



import chap9.method8.myrunnable.MyRunnable;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 * begin: ForkJoinPool-1-worker-1 Wed Nov 22 16:22:03 CST 2017
 Exception in thread "main" java.util.concurrent.RejectedExecutionException
 at java.util.concurrent.ForkJoinPool.externalSubmit(ForkJoinPool.java:2325)
 at java.util.concurrent.ForkJoinPool.externalPush(ForkJoinPool.java:2416)
 at java.util.concurrent.ForkJoinPool.submit(ForkJoinPool.java:2700)
 at chap9.method8.Run3.main(Run3.java:25)
 at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
 at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
 at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
 at java.lang.reflect.Method.invoke(Method.java:497)
 at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
    *
 * 运行后进程马上被销毁，说明对ForkJoinPool对象调用shutdown()方法后再执行任务时出现异常，进程也就马上销毁了，
 * 而正在运行的线程任务也被销毁掉了，运行的效果当然就是字符串“end”没有输出，仅仅打印了begin
 * 为了防止在关闭pool后再运行任务，亏加入一个判断来解决进程意外销毁的问题
 */
public class Run3 {

    public static void main(String[] args) throws InterruptedException,ExecutionException{

        MyRunnable myRunnable = new MyRunnable();
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(myRunnable);
        TimeUnit.SECONDS.sleep(1);
        pool.shutdown();
        pool.submit(myRunnable);
        System.out.println("main end             "+new Date());
        TimeUnit.SECONDS.sleep(Integer.MAX_VALUE/1000);
    }

}
