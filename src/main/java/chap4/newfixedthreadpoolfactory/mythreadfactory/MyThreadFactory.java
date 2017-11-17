package chap4.newfixedthreadpoolfactory.mythreadfactory;

import java.util.concurrent.ThreadFactory;

/**
 * Created by hjy on 17-11-16.
 */
public class MyThreadFactory implements ThreadFactory{
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("定制池中的线程对象的名称"+Math.random());
        return thread;
    }
}
