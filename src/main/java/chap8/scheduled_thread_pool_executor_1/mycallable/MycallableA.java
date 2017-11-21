package chap8.scheduled_thread_pool_executor_1.mycallable;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-21.
 */
public class MycallableA implements Callable<String>{
    @Override
    public String call() throws Exception {
        try {

        System.out.println( Thread.currentThread().getName()+" -MycallableA  begin: "+new Date());
       TimeUnit.SECONDS.sleep(3);
        System.out.println( Thread.currentThread().getName()+" -MycallableA end: "+new Date());
        }catch (Exception e){
            e.printStackTrace();
        }

        return "returnA";
    }
}
