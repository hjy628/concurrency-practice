package chap4.policy_callerruns_policy_2.myrunnable;

import java.util.Date;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-17.
 */
public class MyThreadA extends Thread{

    @Override
    public void run() {

            MyThreadB b = new MyThreadB();

            LinkedBlockingDeque queue = new LinkedBlockingDeque(2);

            ThreadPoolExecutor executor = new ThreadPoolExecutor(2,3,5, TimeUnit.SECONDS,queue,
                    new ThreadPoolExecutor.CallerRunsPolicy());
            System.out.println(" a begin ! "+ Thread.currentThread().getName() +new Date());

            executor.execute(b);
            executor.execute(b);
            executor.execute(b);
            executor.execute(b);
            executor.execute(b);
            executor.execute(b);
            System.out.println(" a end ! " + Thread.currentThread().getName() +new Date());
            System.out.println(" a end ! "  +new Date());

    }
}
