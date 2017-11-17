package chap4.executors_1;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 * 使用Executors类的newCachedThreadPool()方法创建的是无界线程池，可以进行线程自动回收,存放个数上限为Integer.MAX_VALUE
 */
public class Run1 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Runnable1 begin " + new Date());
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("A");
                    System.out.println("Runnable1 end " + new Date());
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Runnable2 begin " + new Date());
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("B");
                    System.out.println("Runnable2 end " + new Date());
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        executorService.shutdown();
    }

}
