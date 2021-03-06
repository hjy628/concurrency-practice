package chap7.executorservice_invokeany_6;

import chap7.executorservice_invokeany_6.mycallable.MycallableA;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-2１.
 *  方法<T>T invokeAny(Collection<? extends Callable<T>> tasks,long timeout,TimeUnit unit) 主要作用是在指定时间内取得第一个先执行完任务的结果值
 */
public class Run {
    public static void main(String[] args) {
        try {
            List list = new ArrayList();
            list.add(new MycallableA());
            ExecutorService executor = Executors.newCachedThreadPool();
            System.out.println(executor);
            //invokeAny只取得最先完成任务的结果值
            String getValueA = (String)executor.invokeAny(list,1, TimeUnit.SECONDS);
            System.out.println("==============="+getValueA);
            System.out.println("mainEND");
        }catch (InterruptedException e){
            System.out.println("进入catch　　InterruptedException　");
            e.printStackTrace();
        }catch (ExecutionException e){
            System.out.println("进入catch　　ExecutionException　");
            e.printStackTrace();
        }catch (TimeoutException e){
            System.out.println("进入catch　　TimeoutException超时了　");
            e.printStackTrace();
        }
    }
}
