package chap8.scheduled_thread_pool_executor_1.mycallable;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-21.
 */
public class MycallableB implements Callable<String>{
    @Override
    public String call() throws Exception {
            System.out.println( Thread.currentThread().getName()+" -MycallableB begin: "+new Date());
            System.out.println( Thread.currentThread().getName()+"-MycallableB end: "+new Date());
            return "returnB";
    }
}
