package chap4.executors_2;

import chap4.executors_2.myrunnable.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by hjy on 17-11-16.
 */
public class Run {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.execute(new MyRunnable((""+(i+1))));
        }

        executorService.shutdown();
    }

}
