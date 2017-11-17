package chap4.threadpoolexecutor_2_shutdownnow.myrunnable;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class MyRunnable implements Runnable{


    @Override
    public void run() {
        try {
            for (int i = 0; i < Integer.MAX_VALUE / 50; i++) {
                String newString = new String();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();

                if (Thread.currentThread().isInterrupted()==true){
                    System.out.println("任务没有完成，就中断了"+Thread.currentThread().getName());
                    throw new InterruptedException();
                }
            }

            System.out.println("任务成功完成!");
        }catch (InterruptedException e){
            System.out.println("进入cache中断了任务");
            e.printStackTrace();
        }

    }
}
