package chap4.executors_3;

import chap4.executors_2_1.myrunnable.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by hjy on 17-11-16.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executorService.execute(new MyRunnable((""+(i+1))));
        }

        for (int i = 0; i < 3; i++) {
            executorService.execute(new MyRunnable((""+(i+1))));
        }
        executorService.shutdown();
    }

}
