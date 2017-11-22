package chap9.method2;


import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 * public void execute(Runnable task) 以异步的方式执行任务
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{
        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("ThreadName="+Thread.currentThread().getName());
            }
        });
        TimeUnit.SECONDS.sleep(5);
    }

}
