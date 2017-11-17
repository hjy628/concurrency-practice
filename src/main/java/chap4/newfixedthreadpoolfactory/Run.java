package chap4.newfixedthreadpoolfactory;

import chap4.newfixedthreadpoolfactory.mythreadfactory.MyThreadFactory;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{
        MyThreadFactory threadFactory = new MyThreadFactory();
        ExecutorService executorService = Executors.newFixedThreadPool(2,threadFactory);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                    try {
                        System.out.println("begin 我在运行"+new Date()+Thread.currentThread().getName());
                        TimeUnit.SECONDS.sleep(3);
                        System.out.println("end 我在运行"+new Date()+Thread.currentThread().getName());
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

            }
        };


        executorService.execute(runnable);
        executorService.execute(runnable);
        executorService.execute(runnable);
    }

}
