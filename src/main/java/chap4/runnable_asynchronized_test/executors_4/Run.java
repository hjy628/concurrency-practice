package chap4.runnable_asynchronized_test.executors_4;

import chap4.runnable_asynchronized_test.executors_4.myrunnable.MyRunnable;

import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-16.
 * 借口Runnable在ThreadPoolExecutor的队列中是按顺序取出，执行却是乱序的
 */
public class Run {

    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(5,10,10, TimeUnit.SECONDS,new LinkedBlockingDeque<>());

        for (int i = 0; i < 50; i++) {
            MyRunnable runnable = new MyRunnable("username"+(i+1));
            executor.execute(runnable);
        }
    }

}
