package chap6.executor_completion_service_errorhandle;

import chap6.executor_completion_service_errorhandle.mycallable.MyCallableA;
import chap6.executor_completion_service_errorhandle.mycallable.MyCallableB;

import java.util.Date;
import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-20.
 * 任务B出现异常，任务A并未输出
 */
public class Run3 {
    public static void main(String[] args) throws InterruptedException,ExecutionException{

        MyCallableA callableA = new MyCallableA();
        MyCallableB callableB = new MyCallableB();

            ExecutorService executorService = Executors.newCachedThreadPool();
            CompletionService csRef = new ExecutorCompletionService(executorService);

        csRef.submit(callableB);    //先执行的B
        csRef.submit(callableA);    //后执行的A


        for (int i = 0; i < 2; i++) {
            System.out.println("---------------------"+" + " + csRef.take().get());
        }
        System.out.println("main end");
    }
}
