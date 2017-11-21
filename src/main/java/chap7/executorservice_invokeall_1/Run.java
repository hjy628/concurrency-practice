package chap7.executorservice_invokeall_1;

import chap7.executorservice_invokeall_1.mycallable.MycallableA;
import chap7.executorservice_invokeall_1.mycallable.MycallableB;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-2１.
 * invokeAll()会返回所有人物的执行结果，并且此方法执行的效果也是阻塞执行的，要把所有的结果都取回时再继续向下运行
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
