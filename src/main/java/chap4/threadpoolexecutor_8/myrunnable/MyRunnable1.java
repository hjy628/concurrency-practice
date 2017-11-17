package chap4.threadpoolexecutor_8.myrunnable;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class MyRunnable1 implements Runnable{


    @Override
    public void run() {
            System.out.println(Thread.currentThread().getName()+"  begin "+new Date());
            System.out.println(Thread.currentThread().getName()+"  end "+new Date());
    }
}
