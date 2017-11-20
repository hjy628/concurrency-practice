package chap6.executor_completion_service_3;

import chap6.executor_completion_service_3.mycallable.MyCallableA;
import chap6.executor_completion_service_3.mycallable.MyCallableB;

import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-20.
 * 返回两个值，因为一共等待了12秒
 */
public class Run2 {
    public static void main(String[] args) throws InterruptedException,ExecutionException{

        MyCallableA callableA = new MyCallableA();
        MyCallableB callableB = new MyCallableB();

            ExecutorService executorService = Executors.newCachedThreadPool();
            CompletionService csRef = new ExecutorCompletionService(executorService);

        csRef.submit(callableA);
        csRef.submit(callableB);

        for (int i = 0; i < 2; i++) {
            System.out.println("---------------------"+" + " + csRef.poll(6, TimeUnit.SECONDS).get());
            System.out.println("X");
        }
        System.out.println("main end");
    }
}
