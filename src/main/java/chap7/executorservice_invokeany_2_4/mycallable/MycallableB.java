package chap7.executorservice_invokeany_2_4.mycallable;

import java.util.Date;
import java.util.concurrent.Callable;

/**
 * Created by hjy on 17-11-21.
 */
public class MycallableB implements Callable<String>{
    @Override
    public String call() throws Exception {
        System.out.println("MycallableB begin: "+new Date());
        for (int i = 0; i < 123456; i++) {
            Math.random();
            Math.random();
            Math.random();
            System.out.println("MycallableB "+(i+1));

        }
        System.out.println("MycallableB end: "+new Date());
        if (1==1){
            System.out.println("1==1");
            throw new Exception("报错了BBB");
        }
        return "returnB";
    }
}
