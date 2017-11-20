package chap5.future_callable_5;

import chap5.future_callable_5.mycallable.MyCallable;

import java.util.Date;
import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-20.
 * 从控制台打印的及结果来看，方法get()具有阻塞特性
 */
public class Run {

    public static void main(String[] args) throws InterruptedException,ExecutionException{


        MyCallable callable = new MyCallable();

        try {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,3,5, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        System.out.println("begin "+new Date());
        Future<String> future = executor.submit(callable);
        System.out.println("返回值"+future.get(5,TimeUnit.SECONDS));
        System.out.println("end "+new Date());
        }catch (InterruptedException e){
            System.out.println("进入catch InterruptedException");
            e.printStackTrace();
        }catch (ExecutionException e){
            System.out.println("进入catch ExecutionException");
            e.printStackTrace();
        }catch (TimeoutException e){
            System.out.println("进入catch TimeoutException");
            e.printStackTrace();
        }



    }

}
