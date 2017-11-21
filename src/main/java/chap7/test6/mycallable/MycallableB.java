package chap7.test6.mycallable;

import java.util.Date;
import java.util.concurrent.Callable;

/**
 * Created by hjy on 17-11-20.
 */
public class MycallableB implements Callable<String>{
    @Override
    public String call() throws Exception {
        System.out.println("MycallableB  "+Thread.currentThread().getName()+" begin: "+new Date());
        for (int i = 0; i < 193456; i++) {
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            System.out.println("MycallableB 在运行中="+(i+1));

        }
        if (1==1){
            System.out.println("xxxxxxxxxxx=中断了");
            throw new NullPointerException();
        }
        System.out.println("MycallableB  "+Thread.currentThread().getName()+" end: "+new Date());
        return "returnB";
    }
}
