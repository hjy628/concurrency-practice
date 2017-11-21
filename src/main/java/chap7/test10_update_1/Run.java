package chap7.test10_update_1;

import chap7.test10_update_1.mycallable.MycallableA;
import chap7.test10_update_1.mycallable.MycallableB;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-2１.
 *  在多个任务的过程中，执行任务快慢与运行时发生的异常也有一些联系，　快的正确慢的异常的情况
 *
 *  从运行结果看，使用invokeAll()方法出现异常后，调用Future对象的get()方法时出现的是CancellationException异常，
 *  而不是invokeAny()方法抛出来的TimeoutException异常
 *MycallableA 223454
 MycallableA 223455
 MycallableA 223456
 invokeAll end Tue Nov 21 14:45:10 CST 2017
 for 第 1次循环
 Exception in thread "main" java.util.concurrent.CancellationException
 at java.util.concurrent.FutureTask.report(FutureTask.java:121)
 at java.util.concurrent.FutureTask.get(FutureTask.java:192)
 at chap7.test10_update_1.executorservice_invokeall_2_2.Run.main(Run.java:29)
 at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
 at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
 at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
 at java.lang.reflect.Method.invoke(Method.java:497)
 at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
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
