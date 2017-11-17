package chap4.threadpoolexecutor_7.myrunnable;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class MyRunnable1 implements Runnable{

    private String username;

    public MyRunnable1(String username) {
        super();
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+"  begin "+new Date());
            TimeUnit.SECONDS.sleep(4);
            System.out.println(Thread.currentThread().getName()+"  end "+new Date());
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
