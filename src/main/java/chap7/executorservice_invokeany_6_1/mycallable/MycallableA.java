package chap7.executorservice_invokeany_6_1.mycallable;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-21.
 */
public class MycallableA implements Callable<String>{
    @Override
    public String call() throws Exception {
        try {

        System.out.println("MycallableA "+Thread.currentThread().getName()+" begin: "+new Date());
        TimeUnit.MILLISECONDS.sleep(500);
        for (int i = 0; i < 193456; i++) {
            String newString = new String();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            System.out.println("MycallableA == "+(i+1));
            if (Thread.currentThread().isInterrupted()==true){
                System.out.println("vvvvvvvvvvvvvvv中断了");
                throw new NullPointerException();
            }
        }
        System.out.println("MycallableA  "+Thread.currentThread().getName()+" end: "+new Date());
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage()+" 听过显式try-catch捕获异常了");
            throw e;
        }

        return "returnB";
    }
}
