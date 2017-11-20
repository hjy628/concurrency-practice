package chap6.executor_completion_service_1.mycallable;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-20.
 */
public class MyCallable implements Callable<String> {
    private String username;
    private long sleepValue;

    public MyCallable(String username, long sleepValue) {
        super();
        this.username = username;
        this.sleepValue = sleepValue;
    }


    @Override
    public String call() throws Exception {
        System.out.println(username);
        TimeUnit.MILLISECONDS.sleep(sleepValue);
        return "reture"+username;
    }
}
