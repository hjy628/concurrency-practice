package chap6.executor_completion_service_3;

import chap6.executor_completion_service_3.mycallable.MyCallableA;
import chap6.executor_completion_service_3.mycallable.MyCallableB;

import java.util.Date;
import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-20.
 * 在第4秒时打印的返回值是null,因为还未到达５秒，他２次打印都正确的到了返回值，因为任务已经完成
 */
public class Run3 {
    public static void main(String[] args) throws InterruptedException,ExecutionException{

        MyCallableA callableA = new MyCallableA();
        MyCallableB callableB = new MyCallableB();

            ExecutorService executorService = Executors.newCachedThreadPool();
            CompletionService csRef = new ExecutorCompletionService(executorService);

        csRef.submit(callableA);
        csRef.submit(callableB);


        System.out.println("zzzzzzzzzzzzz"+ " "+csRef.poll(4,TimeUnit.SECONDS)+" "+new Date());
        System.out.println("X");
        System.out.println("zzzzzzzzzzzzz"+ " "+csRef.poll(2,TimeUnit.SECONDS).get()+" "+new Date());
        System.out.println("X");
        System.out.println("zzzzzzzzzzzzz"+ " "+csRef.poll(5,TimeUnit.SECONDS).get()+" "+new Date());
        System.out.println("X");

        System.out.println("main end");
    }
}
