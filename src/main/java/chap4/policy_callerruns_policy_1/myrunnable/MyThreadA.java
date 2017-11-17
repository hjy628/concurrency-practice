package chap4.policy_callerruns_policy_1.myrunnable;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-17.
 */
public class MyThreadA extends Thread{

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+"  begin "+new Date());
            TimeUnit.SECONDS.sleep(5);
            System.out.println(Thread.currentThread().getName()+"  end "+new Date());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
