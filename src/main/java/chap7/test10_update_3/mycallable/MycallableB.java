package chap7.test10_update_3.mycallable;

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
        for (int i = 0; i < 223456; i++) {
            Math.random();
            Math.random();
            Math.random();
            System.out.println("MycallableB "+(i+1));

        }
        TimeUnit.SECONDS.sleep(2);
            System.out.println( Thread.currentThread().getName()+"-MycallableB end: "+new Date());
            return "returnB";
    }
}
