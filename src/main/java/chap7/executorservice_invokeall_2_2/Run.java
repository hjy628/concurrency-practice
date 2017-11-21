package chap7.executorservice_invokeall_2_2;

import chap7.executorservice_invokeall_2_2.mycallable.MycallableA;
import chap7.executorservice_invokeall_2_2.mycallable.MycallableB;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-2１.
 *  在多个任务的过程中，执行任务快慢与运行时发生的异常也有一些联系，　快的正确慢的异常的情况
 *  像list添加Callable的顺序与运行结果有联系
 *  MycallableB 123454
 MycallableB 123455
 MycallableB 123456
 pool-1-thread-2-MycallableB end: Tue Nov 21 14:38:57 CST 2017
 invokeAll end Tue Nov 21 14:38:57 CST 2017
 进入catch　　ExecutionException　
 java.util.concurrent.ExecutionException: java.lang.Exception: 出现异常
 at java.util.concurrent.FutureTask.report(FutureTask.java:122)
 at java.util.concurrent.FutureTask.get(FutureTask.java:192)
 at chap7.executorservice_invokeall_2_2.Run.main(Run.java:28)
 at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
 at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
 at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
 at java.lang.reflect.Method.invoke(Method.java:497)
 at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
 Caused by: java.lang.Exception: 出现异常
 at chap7.executorservice_invokeall_2_2.mycallable.MycallableA.call(MycallableA.java:23)
 at chap7.executorservice_invokeall_2_2.mycallable.MycallableA.call(MycallableA.java:9)
 at java.util.concurrent.FutureTask.run(FutureTask.java:266)
 at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
 at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
 at java.lang.Thread.run(Thread.java:745)

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
            List<Future<String>> futureList = executor.invokeAll(list);
            System.out.println("invokeAll end " + new Date());
            for (int i = 0; i < futureList.size(); i++) {
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
