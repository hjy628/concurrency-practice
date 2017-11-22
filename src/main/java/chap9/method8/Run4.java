package chap9.method8;



import chap9.method8.myrunnable.MyRunnable;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 * 进程没有被销毁，而任务也成功打印了字符串"end"
 * shutdown()方法不具有中断的效果，也就是shutdown()方法遇到MyRunnable.java类中的sleep方法并没有发生中断异常
 *
 */
public class Run4 {

    public static void main(String[] args) throws InterruptedException,ExecutionException{

        MyRunnable myRunnable = new MyRunnable();
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(myRunnable);
        TimeUnit.SECONDS.sleep(1);
        pool.shutdown();
        if (pool.isShutdown()==false){
            pool.submit(myRunnable);
        }
        System.out.println("main end             "+new Date());
        TimeUnit.SECONDS.sleep(Integer.MAX_VALUE/1000);
    }

}
