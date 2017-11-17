package chap4.threadpoolexecutor_6.myrunnable;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class MyRunnable2 implements Runnable{


    @Override
    public void run() {
            System.out.println(Thread.currentThread().getName()+"  begin "+new Date());
            String ab = null;
            ab.indexOf(0);
            System.out.println(Thread.currentThread().getName()+"  end "+new Date());
    }
}
