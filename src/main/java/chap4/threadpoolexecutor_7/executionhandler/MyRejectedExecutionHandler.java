package chap4.threadpoolexecutor_7.executionhandler;

import chap4.threadpoolexecutor_7.myrunnable.MyRunnable1;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by hjy on 17-11-16.
 */
public class MyRejectedExecutionHandler implements RejectedExecutionHandler{
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println(((MyRunnable1)r).getUsername()+"被拒绝执行");
    }
}
