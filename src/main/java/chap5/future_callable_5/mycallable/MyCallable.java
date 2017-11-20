package chap5.future_callable_5.mycallable;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-20.
 */
public class MyCallable implements Callable<String>{


    @Override
    public String call() throws Exception {
        TimeUnit.SECONDS.sleep(10);
        System.out.println("sleep 10秒执行完了!");
        return "anyString ";
    }
}
