package chap4.executors_2_1;

import chap4.executors_2_1.myrunnable.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyRunnable((""+(i+1))));
        }
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\n\n");
        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyRunnable((""+(i+1))));
        }
        executorService.shutdown();
    }

}
