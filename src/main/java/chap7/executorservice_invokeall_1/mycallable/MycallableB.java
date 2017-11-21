package chap7.executorservice_invokeall_1.mycallable;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-21.
 */
public class MycallableB implements Callable<String>{
    @Override
    public String call() throws Exception {
            System.out.println( Thread.currentThread().getName()+"  begin: "+new Date());
            TimeUnit.SECONDS.sleep(8);
            System.out.println( Thread.currentThread().getName()+" end: "+new Date());

            return "returnB";
    }
}
