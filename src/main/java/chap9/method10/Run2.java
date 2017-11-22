package chap9.method10;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 * Exception in thread "main" java.util.concurrent.CancellationException
 at java.util.concurrent.ForkJoinTask.get(ForkJoinTask.java:1004)
 at chap9.method10.Run2.main(Run2.java:35)
 at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
 at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
 at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
 at java.lang.reflect.Method.invoke(Method.java:497)
 at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
 A=false
 B=true
 *
 * java.util.concurrent.CancellationException　说明先调用shutdown(),再调用get()方法不出现异常，
 * 而先调用shutdownNow(),再调用get()方法出现异常CancellationException ,说明shutdown()与shutdownNow()在对get()方法的处理行为上是不一样的
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException,ExecutionException{
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < Integer.MAX_VALUE / 100; i++) {
                    String newString = new String();
                    Math.random();
                    Math.random();
                    Math.random();
                    Math.random();
                    Math.random();
                    Math.random();
                }
            }
        };

        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask task = pool.submit(runnable);
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println("A="+pool.isTerminating());
        pool.shutdownNow();
        System.out.println("B="+pool.isTerminating());
        System.out.println(task.get());
        TimeUnit.SECONDS.sleep(1);
        System.out.println("C="+pool.isTerminated());

    }

}
