package chap5.rejected_execution_handler_test;

import chap5.rejected_execution_handler_test.executionhandler.MyRejectedExecutionHandler;
import chap5.rejected_execution_handler_test.myrunnable.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by hjy on 17-11-20.
 */
public class Run {

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        ThreadPoolExecutor executor = (ThreadPoolExecutor)service;
        executor.setRejectedExecutionHandler(new MyRejectedExecutionHandler());
        service.submit(new MyRunnable("A"));
        service.submit(new MyRunnable("B"));
        service.submit(new MyRunnable("C"));
        executor.shutdown();
        service.submit(new MyRunnable("D"));
    }


}
