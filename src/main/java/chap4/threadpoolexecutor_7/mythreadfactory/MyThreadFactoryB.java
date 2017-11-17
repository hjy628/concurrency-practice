package chap4.threadpoolexecutor_7.mythreadfactory;

import java.util.Date;
import java.util.concurrent.ThreadFactory;

/**
 * Created by hjy on 17-11-16.
 */
public class MyThreadFactoryB implements ThreadFactory{
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("我的新名称: "+ new Date());
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("　自定义处理异常启用：　"+t.getName() + " " + e.getMessage());
                e.printStackTrace();
            }
        });
        return thread;
    }
}
