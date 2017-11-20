package chap5.future_callable_4.mycallable;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-20.
 */
public class MyCallable implements Callable<String>{


    @Override
    public String call() throws Exception {
        TimeUnit.SECONDS.sleep(2);
        return "我的年龄是：100 ";
    }
}
