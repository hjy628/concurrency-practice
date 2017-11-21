package chap7.executorservice_invokeany_1;

import chap7.executorservice_invokeany_1.mycallable.MycallableA;
import chap7.executorservice_invokeany_1.mycallable.MycallableB1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by hjy on 17-11-20.
 * 虽然方法invokeAny()已经取得returnA的值，但线程B还在继续运行中，直到运行完毕
 */
public class Run1 {
    public static void main(String[] args) {
        try {
            List list = new ArrayList();
            list.add(new MycallableA());
            list.add(new MycallableB1());
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
