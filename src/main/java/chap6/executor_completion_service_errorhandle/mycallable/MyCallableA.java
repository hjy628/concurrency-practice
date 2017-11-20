package chap6.executor_completion_service_errorhandle.mycallable;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-20.
 */
public class MyCallableA implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("MyCallableA begin:"+new Date());
        TimeUnit.SECONDS.sleep(1);
        System.out.println("MyCallableA end:"+new Date());
        return "retureA";
    }
}
