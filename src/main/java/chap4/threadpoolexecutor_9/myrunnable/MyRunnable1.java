package chap4.threadpoolexecutor_9.myrunnable;

import java.util.Date;

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
