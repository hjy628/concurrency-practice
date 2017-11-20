package chap6.executor_completion_service_errorhandle;

import chap6.executor_completion_service_errorhandle.mycallable.MyCallableA;
import chap6.executor_completion_service_errorhandle.mycallable.MyCallableB;

import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-20.
 * 任务A并未打印，任务B抛出异常
 */
public class Run6 {
    public static void main(String[] args) throws InterruptedException,ExecutionException{

        MyCallableA callableA = new MyCallableA();
        MyCallableB callableB = new MyCallableB();

            ExecutorService executorService = Executors.newSingleThreadExecutor();
            CompletionService csRef = new ExecutorCompletionService(executorService);

        csRef.submit(callableB);    //先执行B
        csRef.submit(callableA);    //后执行A


        for (int i = 0; i < 2; i++) {
            System.out.println("---------------------"+" + " + csRef.poll());
        }

        TimeUnit.SECONDS.sleep(7);

        System.out.println("A处" + " "+csRef.poll().get());
        System.out.println("B处" + " "+csRef.poll().get());
        System.out.println("main end");
    }
}
