package chap7.executorservice_invokeall_2_2.mycallable;

import java.util.Date;
import java.util.concurrent.Callable;

/**
 * Created by hjy on 17-11-21.
 */
public class MycallableB implements Callable<String>{
    @Override
    public String call() throws Exception {
            System.out.println( Thread.currentThread().getName()+" -MycallableB begin: "+new Date());
        for (int i = 0; i < 123456; i++) {
            Math.random();
            Math.random();
            Math.random();
            System.out.println("MycallableB "+(i+1));

        }
            System.out.println( Thread.currentThread().getName()+"-MycallableB end: "+new Date());
            return "returnB";
    }
}
