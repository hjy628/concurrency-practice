package chap7.executorservice_invokeany_1.mycallable;

import java.util.Date;
import java.util.concurrent.Callable;

/**
 * Created by hjy on 17-11-20.
 */
public class MycallableB1 implements Callable<String>{
    @Override
    public String call() throws Exception {
        System.out.println("MycallableB begin: "+new Date());
        for (int i = 0; i < 223456; i++) {
            Math.random();
            Math.random();
            Math.random();
            System.out.println("MycallableB "+(i+1));

        }
        System.out.println("MycallableB end: "+new Date());
        return "returnB";
    }
}
