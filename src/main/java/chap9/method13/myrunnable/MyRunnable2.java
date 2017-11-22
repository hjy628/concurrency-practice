package chap9.method13.myrunnable;

import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 */
public class MyRunnable2 implements Runnable{
    @Override
    public void run() {
         try {
             TimeUnit.SECONDS.sleep(5);
         }catch (InterruptedException e){
             e.printStackTrace();
         }
    }
}
