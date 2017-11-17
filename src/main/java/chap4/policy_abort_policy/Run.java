package chap4.policy_abort_policy;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-17.
 */
public class Run {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("打印了！ begin "+Thread.currentThread().getName());
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println("打印了！ end "+Thread.currentThread().getName());
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,3,5,TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(2),new ThreadPoolExecutor.AbortPolicy());

        executor.execute(runnable); //不报错
        executor.execute(runnable); //不报错
        executor.execute(runnable); //不报错
        executor.execute(runnable); //不报错
        executor.execute(runnable); //不报错
        executor.execute(runnable); //报错

    }

}
