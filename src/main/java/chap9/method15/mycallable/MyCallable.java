package chap9.method15.mycallable;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 */
public class MyCallable implements Callable<String>{

    private long sleepValue;

    public MyCallable(long sleepValue) {
        super();
        this.sleepValue = sleepValue;
    }

    @Override
    public String call() throws Exception {
        try {
            System.out.println(Thread.currentThread().getName()+" sleep "+sleepValue+" nowTime: "+new Date());
            TimeUnit.MILLISECONDS.sleep(sleepValue);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "我是返回值";
    }
}
