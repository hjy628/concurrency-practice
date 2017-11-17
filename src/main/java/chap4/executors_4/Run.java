package chap4.executors_4;

import chap4.executors_4.myrunnable.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by hjy on 17-11-16.
 */
public class Run {

    public static void main(String[] args) {

        int t = 2*2^(1-1)*2;
        System.out.println(t);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 3; i++) {
            executorService.execute(new MyRunnable((" "+ (i+1))));
        }

        executorService.shutdown();
    }

}
