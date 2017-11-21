package chap8.scheduled_thread_pool_executor_9.myrunnable;

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

        try {
            while (true){
                if (Thread.currentThread().isInterrupted()==true){
                    throw new InterruptedException();
                }
                System.out.println( Thread.currentThread().getName()+" run! username="+username+"   "+new Date());
                TimeUnit.SECONDS.sleep(1);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("中断了!");
        }


    }
}
