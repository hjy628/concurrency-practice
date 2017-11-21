package chap8.scheduled_thread_pool_executor_3.mycallable;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-21.
 */
public class MycallableA implements Callable<String>{
    @Override
    public String call() throws Exception {
        System.out.println("a call run = "+new Date());
        return "returnA";
    }
}
