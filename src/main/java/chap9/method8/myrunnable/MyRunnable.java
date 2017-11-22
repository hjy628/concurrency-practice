package chap9.method8.myrunnable;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        try {

        System.out.println("begin: "+Thread.currentThread().getName()+" "+new Date());
        TimeUnit.SECONDS.sleep(4);
        System.out.println("end: "+Thread.currentThread().getName()+" "+new Date());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
