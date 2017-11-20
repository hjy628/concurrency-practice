package chap5.future_callable_1;

import chap5.future_callable_1.mycallable.MyCallable;

import java.util.Date;
import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-20.
 * 从控制台打印的及结果来看，方法get()具有阻塞特性
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{

        try {

        MyCallable callable = new MyCallable(100);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,3,5, TimeUnit.SECONDS,new LinkedBlockingDeque<>());
        Future<String> future = executor.submit(callable);

        System.out.println("main A " + new Date());
        System.out.println(future.get());
        System.out.println("main B " + new Date());

        }catch (ExecutionException e){
            e.printStackTrace();
        }

    }

}
