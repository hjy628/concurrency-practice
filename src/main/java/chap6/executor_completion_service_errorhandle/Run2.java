package chap6.executor_completion_service_errorhandle;

import chap6.executor_completion_service_errorhandle.mycallable.MyCallableA;
import chap6.executor_completion_service_errorhandle.mycallable.MyCallableB;

import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-20.
 * 任务A执行时间较少，也未出现异常，正确打印任务A的值，任务B出现异常
 */
public class Run2 {
    public static void main(String[] args) throws InterruptedException,ExecutionException{

        MyCallableA callableA = new MyCallableA();
        MyCallableB callableB = new MyCallableB();

            ExecutorService executorService = Executors.newCachedThreadPool();
            CompletionService csRef = new ExecutorCompletionService(executorService);

        csRef.submit(callableA);    //先执行的A
        csRef.submit(callableB);    //后执行的B

        for (int i = 0; i < 2; i++) {
            System.out.println("---------------------"+" + " + csRef.take().get());
            System.out.println("X");
        }
        System.out.println("main end");
    }
}
