package chap4.executors_2_1.myrunnable;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class MyRunnable implements Runnable{

    private String userName;

    public MyRunnable(String userName) {
        super();
        this.userName = userName;
    }

    @Override
    public void run() {
            System.out.println(Thread.currentThread().getName()+" userName="+userName+" begin "+new Date());
            System.out.println(Thread.currentThread().getName()+" userName="+userName+" end "+new Date());

    }
}
