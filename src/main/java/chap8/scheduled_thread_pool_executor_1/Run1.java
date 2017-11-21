package chap8.scheduled_thread_pool_executor_1;

import chap8.scheduled_thread_pool_executor_1.mycallable.MycallableA;
import chap8.scheduled_thread_pool_executor_1.mycallable.MycallableB;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-21.
 * 从X到Y的运行时间为7秒,阻塞点是get()方法
 * 从运行结果可以发现：
 * public <V> ScheduledFuture<V> schedule(Callable<V> callable,long delay,TimeUnit unit)方法中的第2个参数
 * 在多任务中同时消耗时间，并不是一个任务执行完毕后再等待4秒继续执行的效果
 * 由于第一个任务从计划任务到运行结束需要用时7秒，那么第2个任务其实是想在第4秒被执行，由于是单任务的计划任务池，所以第2个任务的执行时间被延后3秒
 *
 *
 */
public class Run1 {

    public static void main(String[] args) {

        try {
            List<Callable> callableList = new ArrayList<>();
            callableList.add(new MycallableA());
            callableList.add(new MycallableB());
            //调用方法newSingleThreadScheduledExecutor()
            //取得一个单任务的计划任务执行池
            ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
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
