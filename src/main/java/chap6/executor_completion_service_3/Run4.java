package chap6.executor_completion_service_3;

import chap6.executor_completion_service_3.mycallable.MyCallableA;
import chap6.executor_completion_service_3.mycallable.MyCallableB;

import java.util.Date;
import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-20.
 * 方法poll()中timeout的值如果小于任务执行的时间，则返回值就是null
 */
public class Run4 {
    public static void main(String[] args) throws InterruptedException,ExecutionException{

        MyCallableA callableA = new MyCallableA();
        MyCallableB callableB = new MyCallableB();

            ExecutorService executorService = Executors.newCachedThreadPool();
            CompletionService csRef = new ExecutorCompletionService(executorService);

        csRef.submit(callableA);
        csRef.submit(callableB);


        System.out.println("zzzzzzzzzzzzz"+ " "+csRef.poll(4,TimeUnit.SECONDS)+" "+new Date());
        System.out.println("X");
        System.out.println("zzzzzzzzzzzzz"+ " "+csRef.poll(7,TimeUnit.SECONDS).get()+" "+new Date());
        System.out.println("X");


        System.out.println("main end");
    }
}
