package chap7.executorservice_invokeany_1;

import chap7.executorservice_invokeany_1.mycallable.MycallableA;
import chap7.executorservice_invokeany_1.mycallable.MycallableB2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by hjy on 17-11-20.
 * 线程A执行完毕后，线程池将线程B设置为中断interrupte状态，而线程B可以自定义对中断interrupte状态进行处理，也就是可以决定是否使用
 * Thread.currentThread().isInterrupted()结合throw new InterruptedException()的代码
 */
public class Run2 {
    public static void main(String[] args) {
        try {
            List list = new ArrayList();
            list.add(new MycallableA());
            list.add(new MycallableB2());
            ExecutorService executor = Executors.newCachedThreadPool();
            //invokeAny只取得最先完成任务的结果值
            String getValueA = (String)executor.invokeAny(list);
            System.out.println("==============="+getValueA);
            System.out.println("+++++++++++++++++++++++++++=");
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            e.printStackTrace();
        }
    }
}
