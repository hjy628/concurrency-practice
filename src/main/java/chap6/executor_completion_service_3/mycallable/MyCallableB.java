package chap6.executor_completion_service_3.mycallable;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-20.
 */
public class MyCallableB implements Callable<String> {

    @Override
    public String call() throws Exception {
        TimeUnit.SECONDS.sleep(10);
        System.out.println("MyCallableB: "+new Date());
        return "retureB";
    }
}
