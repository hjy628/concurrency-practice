package chap8.scheduled_thread_pool_executor_2;

import chap8.scheduled_thread_pool_executor_2.myrunnable.MyrunnableA;
import chap8.scheduled_thread_pool_executor_2.myrunnable.MyrunnableB;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-21.
 *
 *
 */
public class Run {

    public static void main(String[] args) {

            List<Runnable> runnableList = new ArrayList<>();
            runnableList.add(new MyrunnableA());
            runnableList.add(new MyrunnableB());
            ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
            executorService.schedule(runnableList.get(0),0L,TimeUnit.SECONDS);
           executorService.schedule(runnableList.get(1),0L,TimeUnit.SECONDS);
            System.out.println("          X= "+new Date());
            System.out.println("          Y= "+new Date());

    }


}
