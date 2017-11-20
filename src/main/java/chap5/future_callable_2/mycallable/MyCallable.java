package chap5.future_callable_2.mycallable;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-20.
 */
public class MyCallable implements Callable<String>{
    private int age;

    public MyCallable(int age) {
        super();
        this.age = age;
    }

    @Override
    public String call() throws Exception {
        TimeUnit.SECONDS.sleep(8);
        return "返回值　年龄是： "+age;
    }
}
