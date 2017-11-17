package chap4.threadpoolexecutor_8.mythreadfactory;

import java.util.Date;
import java.util.concurrent.ThreadFactory;

/**
 * Created by hjy on 17-11-16.
 */
public class MyThreadFactoryA implements ThreadFactory{
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("hjy"+ new Date());
        return thread;
    }
}
