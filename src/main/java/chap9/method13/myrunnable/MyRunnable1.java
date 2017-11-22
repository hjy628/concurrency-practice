package chap9.method13.myrunnable;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 */
public class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        try {

            System.out.println("begin "+Thread.currentThread().getName()+ "  "+new Date());
            TimeUnit.SECONDS.sleep(4);
            System.out.println("end "+Thread.currentThread().getName()+ "  "+new Date());

        }catch (InterruptedException e){
            System.out.println("进入catch中断了任务");
            e.printStackTrace();
        }
    }
}
