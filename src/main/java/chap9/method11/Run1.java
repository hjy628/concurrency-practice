package chap9.method11;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 */
public class Run1 {

    public static void main(String[] args) throws InterruptedException{
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("打印了! begin "+Thread.currentThread().getName());
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("打印了! end "+Thread.currentThread().getName());
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(runnable);
        System.out.println("A:"+pool.isShutdown());
        pool.shutdown();
        TimeUnit.SECONDS.sleep(5);
        System.out.println("B:"+pool.isShutdown());




    }

}
