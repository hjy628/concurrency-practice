package chap4.newcachedthreadpoolfactory;

import chap4.newcachedthreadpoolfactory.mythreadfactory.MyThreadFactory;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by hjy on 17-11-16.
 */
public class Run {

    public static void main(String[] args) {
        MyThreadFactory threadFactory = new MyThreadFactory();
        ExecutorService executorService = Executors.newCachedThreadPool(threadFactory);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("我在运行 "+new Date()+" " + Thread.currentThread().getName());
            }
        });

        executorService.shutdown();
    }

}
