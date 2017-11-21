package chap8.scheduled_thread_pool_executor_5_1.myrunnable;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-21.
 */
public class MyrunnableA implements Runnable{

    @Override
    public void run() {
        try {

            System.out.println( Thread.currentThread().getName()+" -MyrunnableA  begin: "+new Date());
            System.out.println( Thread.currentThread().getName()+" -MyrunnableA end: "+new Date());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
