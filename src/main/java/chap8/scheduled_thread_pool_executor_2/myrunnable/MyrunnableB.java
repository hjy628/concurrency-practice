package chap8.scheduled_thread_pool_executor_2.myrunnable;

import java.util.Date;

/**
 * Created by hjy on 17-11-21.
 */
public class MyrunnableB implements Runnable{

    @Override
    public void run() {
        System.out.println( Thread.currentThread().getName()+" -MycallableB begin: "+new Date());
        System.out.println( Thread.currentThread().getName()+"-MycallableB end: "+new Date());
    }
}
