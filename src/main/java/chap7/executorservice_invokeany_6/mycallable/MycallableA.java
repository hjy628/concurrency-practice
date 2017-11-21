package chap7.executorservice_invokeany_6.mycallable;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-21.
 */
public class MycallableA implements Callable<String>{
    @Override
    public String call() throws Exception {
        System.out.println("MycallableA begin: "+new Date());
        TimeUnit.MILLISECONDS.sleep(995);
        for (int i = 0; i < 193456; i++) {
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            System.out.println("MycallableA "+(i+1));
        }
        System.out.println("MycallableA end: "+new Date());
        return "MycallableAValue";
    }
}
