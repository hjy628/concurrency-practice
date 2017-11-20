package chap5.test12;

import chap5.test12.mycallable.MyCallable;

import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-20.
 * 从控制台打印的及结果来看，方法get()具有阻塞特性
 */
public class Run {

    public static void main(String[] args) throws InterruptedException,ExecutionException{


        MyCallable callable = new MyCallable();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(50,Integer.MAX_VALUE,5, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        Future<String> future = executor.submit(callable);
        TimeUnit.SECONDS.sleep(3);
        System.out.println(future.cancel(false)+"------------------------------------------------------------"+future.isCancelled());


    }

}
