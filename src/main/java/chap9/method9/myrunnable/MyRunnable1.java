package chap9.method9.myrunnable;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 */
public class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        try {

            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String newString = new String();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();

                if (Thread.currentThread().isInterrupted()==true){
                    System.out.println("任务没有完成，中断了");
                    throw new InterruptedException();
                }
            }
            System.out.println("任务成功完成!");

        }catch (InterruptedException e){
            System.out.println("进入catch中断了任务");
            e.printStackTrace();
        }
    }
}
