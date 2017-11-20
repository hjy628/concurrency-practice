package chap6.executor_completion_service_errorhandle;

import chap6.executor_completion_service_errorhandle.mycallable.MyCallableA;
import chap6.executor_completion_service_errorhandle.mycallable.MyCallableB;

import java.util.Date;
import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-20.
 *直接输出FutureTask对象
 */
public class Run4 {
    public static void main(String[] args) throws InterruptedException,ExecutionException{

        MyCallableA callableA = new MyCallableA();
        MyCallableB callableB = new MyCallableB();

            ExecutorService executorService = Executors.newCachedThreadPool();
            CompletionService csRef = new ExecutorCompletionService(executorService);

        csRef.submit(callableA);
        csRef.submit(callableB);


        for (int i = 0; i < 2; i++) {
            System.out.println("---------------------"+" + " + csRef.poll());
        }

        TimeUnit.SECONDS.sleep(6);

        System.out.println("A处" + " "+csRef.poll());
        System.out.println("B处" + " "+csRef.poll());
        System.out.println("main end");
    }
}
