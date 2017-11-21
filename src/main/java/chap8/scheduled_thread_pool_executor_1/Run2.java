package chap8.scheduled_thread_pool_executor_1;

import chap8.scheduled_thread_pool_executor_1.mycallable.MycallableA;
import chap8.scheduled_thread_pool_executor_1.mycallable.MycallableB;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-21.
 * 
 *
 */
public class Run2 {

    public static void main(String[] args) {

        try {
            List<Callable> callableList = new ArrayList<>();
            callableList.add(new MycallableA());
            callableList.add(new MycallableB());
            //调用方法newScheduledThreadPool(corePoolSize>1)
            //取得一个同时运行corePoolSize任务个数的计划任务执行池ScheduledExecutorService
            ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
            ScheduledFuture<String> futureA = executorService.schedule(callableList.get(0),4L,TimeUnit.SECONDS);
            ScheduledFuture<String> futureB = executorService.schedule(callableList.get(1),4L,TimeUnit.SECONDS);
            System.out.println("          X= "+new Date());
            System.out.println("返回值A: "+futureA.get());
            System.out.println("返回值B: "+futureB.get());
            System.out.println("          Y= "+new Date());
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            e.printStackTrace();
        }


    }


}
