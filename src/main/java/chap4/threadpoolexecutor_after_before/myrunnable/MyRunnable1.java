package chap4.threadpoolexecutor_after_before.myrunnable;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class MyRunnable1 implements Runnable{

    private String userName;

    public MyRunnable1(String userName) {
        super();
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
