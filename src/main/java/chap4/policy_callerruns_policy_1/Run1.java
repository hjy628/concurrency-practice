package chap4.policy_callerruns_policy_1;


import chap4.policy_callerruns_policy_1.myrunnable.MyThreadA;

import java.util.Date;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run1 {

    public static void main(String[] args) throws InterruptedException{
        MyThreadA runnable = new MyThreadA();

        LinkedBlockingDeque queue = new LinkedBlockingDeque(2);


        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,3,5, TimeUnit.SECONDS,queue,
                new ThreadPoolExecutor.CallerRunsPolicy());
        System.out.println(" a begin ! "+ Thread.currentThread().getName() +new Date());

        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        System.out.println(" a end ! " + Thread.currentThread().getName() +new Date());

    }



}
