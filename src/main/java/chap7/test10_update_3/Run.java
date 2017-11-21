package chap7.test10_update_3;

import chap7.test10_update_3.mycallable.MycallableA;
import chap7.test10_update_3.mycallable.MycallableB;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-2１.
 *  在多个任务的过程中，执行任务快慢与运行时发生的异常也有一些联系，　全慢的异常的情况
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            List<Callable<String>> list = new ArrayList<Callable<String>>();
            list.add(new MycallableA());
            list.add(new MycallableB());
            ExecutorService executor = Executors.newCachedThreadPool();
            System.out.println("invokeAll begin " + new Date());
            System.out.println(executor);
            List<Future<String>> futureList = executor.invokeAll(list,2,TimeUnit.SECONDS);
            System.out.println("invokeAll end " + new Date());
            for (int i = 0; i < futureList.size(); i++) {
                System.out.println("for 第 "+(i+1)+"次循环");
                System.out.println("返回的结果: "+futureList.get(i).get()+" "+new Date());
            }
        }catch (InterruptedException e){
            System.out.println("进入catch　　InterruptedException　");
            e.printStackTrace();
        }catch (ExecutionException e){
            System.out.println("进入catch　　ExecutionException　");
            e.printStackTrace();
        }
    }
}
