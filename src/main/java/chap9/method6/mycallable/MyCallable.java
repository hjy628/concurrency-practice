package chap9.method6.mycallable;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 */
public class MyCallable implements Callable<String>{
    @Override
    public String call() throws Exception {
        try {
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "我是返回值callableVersion";
    }
}
