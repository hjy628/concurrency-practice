package chap8.scheduled_thread_pool_executor_4;

import chap8.scheduled_thread_pool_executor_4.myrunnable.MyrunnableA;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-21.
 *  执行任务时间大于>period预定的周期时间，也就是产生了超时的效果
 *
 */
public class Run {

    public static void main(String[] args) {

            List<Runnable> runnableList = new ArrayList<>();
            runnableList.add(new MyrunnableA());
            ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
            System.out.println("          X= "+new Date());
        executorService.scheduleAtFixedRate(runnableList.get(0),1,2,TimeUnit.SECONDS);
        System.out.println("          Y= "+new Date());

    }


}
