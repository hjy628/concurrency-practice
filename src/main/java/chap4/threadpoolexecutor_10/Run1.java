package chap4.threadpoolexecutor_10;


import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run1 {

    public static void main(String[] args) throws InterruptedException{

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("打印了！  "+Thread.currentThread().getName());
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,2,5, TimeUnit.SECONDS,new LinkedBlockingDeque<>());
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        TimeUnit.SECONDS.sleep(1);
        System.out.println(executor.getCompletedTaskCount());
        TimeUnit.SECONDS.sleep(1);
        System.out.println(executor.getCompletedTaskCount());
        TimeUnit.SECONDS.sleep(1);
        System.out.println(executor.getCompletedTaskCount());
        TimeUnit.SECONDS.sleep(1);
        System.out.println(executor.getCompletedTaskCount());
        TimeUnit.SECONDS.sleep(1);
        System.out.println(executor.getCompletedTaskCount());

    }



}
