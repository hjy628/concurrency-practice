package chap8.scheduled_thread_pool_executor_4_1;

import chap8.scheduled_thread_pool_executor_4_1.myrunnable.MyrunnableA;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-21.
 *  执行任务时间小于<period预定的周期时间
 *  scheduleAtFixedRate()方法返回的ScheduledFuture对象无法获得返回值，也就是scheduleAtFixedRate()方法不具有获得返回值的功能
 *  而schedule()方法却可以获得返回值
 *  当使用scheduleAtFixedRate()方法实现重复运行任务的效果是，需要结合自定义Runnable接口的实现类，不要使用FutureTask类，
 *  因为FutureTask类并不能实现重复运行的效果
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
