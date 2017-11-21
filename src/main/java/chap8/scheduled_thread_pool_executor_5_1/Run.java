package chap8.scheduled_thread_pool_executor_5_1;

import chap8.scheduled_thread_pool_executor_5_1.myrunnable.MyrunnableA;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-21.
 *  方法scheduleWithFixedDelay()的主要作用是设置多个人物之间固定的运行时间间隔
 *  执行任务时间小于<period预定的时间
 *
 */
public class Run {

    public static void main(String[] args) {

            List<Runnable> runnableList = new ArrayList<>();
            runnableList.add(new MyrunnableA());
            ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
            System.out.println("          X= "+new Date());
        executorService.scheduleWithFixedDelay(runnableList.get(0),1,2,TimeUnit.SECONDS);
        System.out.println("          Y= "+new Date());

    }


}
