package chap5.future_callable_6.mycallable;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-20.
 */
public class MyCallable implements Callable<String>{

    private String number;

    public MyCallable(String number) {
        super();
        this.number = number;
    }

    @Override
    public String call() throws Exception {
        Integer.parseInt("a");
        return "anyString "+number;
    }
}
