package chap9.method15;


import chap9.method15.mycallable.MyCallable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-22.
 * 方法public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) 具有阻塞特性
 */
public class Run {

    public static void main(String[] args) throws InterruptedException,ExecutionException{

        List list = new ArrayList();
        list.add(new MyCallable(5000));
        list.add(new MyCallable(4000));
        list.add(new MyCallable(3000));
        list.add(new MyCallable(2000));
        list.add(new MyCallable(1000));

        ForkJoinPool pool = new ForkJoinPool();

        List<Future<String>> futureList = pool.invokeAll(list);

        for (int i = 0; i < futureList.size(); i++) {
            System.out.println(futureList.get(i).get() + "nowTime: "+new Date());
        }

    }

}
