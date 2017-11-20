package chap6.executor_completion_service_errorhandle.mycallable;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-20.
 */
public class MyCallableB implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("MyCallableB begin:"+new Date());
        TimeUnit.SECONDS.sleep(5);
        int i = 0;
        if (i==0){
            throw new Exception("抛出异常");
        }
        System.out.println("MyCallableB end:"+new Date());
        return "retureB";
    }
}
