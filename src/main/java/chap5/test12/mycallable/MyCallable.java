package chap5.test12.mycallable;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-20.
 */
public class MyCallable implements Callable<String>{


    @Override
    public String call() throws Exception {
        try {

        while (1==1){
            TimeUnit.MILLISECONDS.sleep(300);
            if (Thread.currentThread().isInterrupted()){
                throw new InterruptedException();
            }
            System.out.println(Thread.currentThread().getName()+new Date());
        }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        return "我的年龄是：100 ";
    }
}
