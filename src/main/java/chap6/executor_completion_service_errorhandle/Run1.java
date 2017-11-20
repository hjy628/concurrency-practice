package chap6.executor_completion_service_errorhandle;

import chap6.executor_completion_service_errorhandle.mycallable.MyCallableA;
import chap6.executor_completion_service_errorhandle.mycallable.MyCallableB;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by hjy on 17-11-20.
 * 虽然出现异常，但并没有调用FutureTask类的get()方法，所以不出现异常
 */
public class Run1 {
    public static void main(String[] args) throws InterruptedException{

        MyCallableA callableA = new MyCallableA();
        MyCallableB callableB = new MyCallableB();

            ExecutorService executorService = Executors.newCachedThreadPool();
            CompletionService csRef = new ExecutorCompletionService(executorService);

        csRef.submit(callableA);
        csRef.submit(callableB);

        for (int i = 0; i < 2; i++) {
            System.out.println("---------------------"+" + " + csRef.take());
        }
        System.out.println("main end");
    }
}
