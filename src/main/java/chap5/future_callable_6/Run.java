package chap5.future_callable_6;

import chap5.future_callable_6.mycallable.MyCallable;

import java.util.Date;
import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-20.
 * 从控制台打印的及结果来看，方法get()具有阻塞特性
 */
public class Run {

    public static void main(String[] args) throws InterruptedException,ExecutionException{


        MyCallable callable = new MyCallable("1");

        try {

        ExecutorService executor = Executors.newCachedThreadPool();
        Future<String> future = executor.submit(callable);
        System.out.println("返回值"+future.get());
        }catch (InterruptedException e){
            System.out.println("进入catch InterruptedException");
            e.printStackTrace();
        }catch (ExecutionException e){
            System.out.println("内部执行错误!");
            e.printStackTrace();
        }



    }

}
