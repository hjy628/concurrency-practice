package chap7.test6.mycallable;

import java.util.Date;
import java.util.concurrent.Callable;

/**
 * Created by hjy on 17-11-20.
 */
public class MycallableA implements Callable<String>{
    @Override
    public String call() throws Exception {
        System.out.println("MycallableA "+Thread.currentThread().getName()+" begin: "+new Date());
        for (int i = 0; i < 123456; i++) {
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            System.out.println("MycallableA 在运行中"+(i+1));

        }
        System.out.println("MycallableA "+Thread.currentThread().getName()+" end: "+new Date());
        return "returnA";
    }
}
