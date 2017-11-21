package chap7.test3.mycallable;

import java.util.Date;
import java.util.concurrent.Callable;

/**
 * Created by hjy on 17-11-20.
 */
public class MycallableB2 implements Callable<String>{
    @Override
    public String call() throws Exception {
        try {


            System.out.println("MycallableB  " + Thread.currentThread().getName() + " begin: " + new Date());
            for (int i = 0; i < 193456; i++) {
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                System.out.println("MycallableB 在运行中=" + (i + 1));

            }
            if (1 == 1) {
                System.out.println("xxxxxxxxxxx=中断了");
                throw new NullPointerException();
            }
            System.out.println("MycallableB  " + Thread.currentThread().getName() + " end: " + new Date());
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage() + "通过显式try-catch捕获异常了");
            throw e;
        }
        return "returnB";
    }
}
