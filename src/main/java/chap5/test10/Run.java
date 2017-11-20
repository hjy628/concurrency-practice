package chap5.test10;

import chap5.test10.mycallable.MyCallable;

import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-20.
 *
 */
public class Run {

    public static void main(String[] args) throws InterruptedException,ExecutionException{


        MyCallable callable = new MyCallable();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(50,Integer.MAX_VALUE,5, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        Future<String> future = executor.submit(callable);
        TimeUnit.SECONDS.sleep(1);
        System.out.println(future.cancel(true)+"-----------------------------------------------------------"+future.isCancelled());
        TimeUnit.SECONDS.sleep(1);
        executor.shutdown();

    }

}
