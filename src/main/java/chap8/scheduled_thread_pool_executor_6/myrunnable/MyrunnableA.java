package chap8.scheduled_thread_pool_executor_6.myrunnable;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-21.
 */
public class MyrunnableA implements Runnable{

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public MyrunnableA() {
        super();
    }


    public MyrunnableA(String username) {
        super();
        this.username = username;
    }

    @Override
    public void run() {
            System.out.println( Thread.currentThread().getName()+" run! username="+username+"   "+new Date());
    }
}
