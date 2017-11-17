package chap4.threadpoolexecutor_5.myrunnable;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class MyRunnable2 implements Runnable{


    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+"  begin "+new Date());
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread().getName()+"  end "+new Date());
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
