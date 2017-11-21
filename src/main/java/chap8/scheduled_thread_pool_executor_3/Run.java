package chap8.scheduled_thread_pool_executor_3;

import chap8.scheduled_thread_pool_executor_3.mycallable.MycallableA;

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

        try {

            List<Callable> callables = new ArrayList<>();
            callables.add(new MycallableA());
            ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
            ScheduledFuture<String> futureA = executorService.schedule(callables.get(0),4L,TimeUnit.SECONDS);
            System.out.println("          X= "+new Date());
            System.out.println("返回值A: "+futureA.get());
            System.out.println("          Y= "+new Date());
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            e.printStackTrace();
        }

    }


}
