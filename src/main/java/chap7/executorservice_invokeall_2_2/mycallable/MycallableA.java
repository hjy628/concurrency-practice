package chap7.executorservice_invokeall_2_2.mycallable;

import java.util.Date;
import java.util.concurrent.Callable;

/**
 * Created by hjy on 17-11-21.
 */
public class MycallableA implements Callable<String>{
    @Override
    public String call() throws Exception {
        System.out.println( Thread.currentThread().getName()+" -MycallableA  begin: "+new Date());
        for (int i = 0; i < 123; i++) {
            Math.random();
            Math.random();
            Math.random();
            System.out.println("MycallableA "+(i+1));

        }
        System.out.println( Thread.currentThread().getName()+" -MycallableA end: "+new Date());
        if (1==1){
            System.out.println("A报错了");
            throw new Exception("出现异常");
        }
        return "returnA";
    }
}
