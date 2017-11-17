package chap4.threadpoolexecutor_3;


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
                    System.out.println("打印了! begin"+Thread.currentThread().getName());
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("打印了! end"+Thread.currentThread().getName());
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,2,Integer.MAX_VALUE, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        executor.execute(runnable);
        System.out.println("A="+executor.isShutdown());
        executor.shutdown();
        System.out.println("B="+executor.isShutdown());
        System.out.println("main end");
    }



}
