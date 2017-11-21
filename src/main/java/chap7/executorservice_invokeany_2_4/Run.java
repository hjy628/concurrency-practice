package chap7.executorservice_invokeany_2_4;

import chap7.executorservice_invokeany_2_4.mycallable.MycallableA;
import chap7.executorservice_invokeany_2_4.mycallable.MycallableB;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by hjy on 17-11-2１.
 * 都出现异常时返回最后一个异常并输出
 */
public class Run {
    public static void main(String[] args) {
        try {
            List list = new ArrayList();
            list.add(new MycallableA());
            list.add(new MycallableB());
            ExecutorService executor = Executors.newCachedThreadPool();
            System.out.println(executor);
            //invokeAny只取得最先完成任务的结果值
            String getValueA = (String)executor.invokeAny(list);
            System.out.println("==============="+getValueA);
            System.out.println("mainEND");
        }catch (InterruptedException e){
            System.out.println("进入catch　　InterruptedException　");
            e.printStackTrace();
        }catch (ExecutionException e){
            System.out.println("进入catch　　ExecutionException　");
            e.printStackTrace();
        }
    }
}
