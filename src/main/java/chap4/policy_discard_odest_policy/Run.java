package chap4.policy_discard_odest_policy;

import chap4.policy_discard_odest_policy.myrunnable.MyRunnable1;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-17.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{

        ArrayBlockingQueue queue = new ArrayBlockingQueue(2);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,3,5,TimeUnit.SECONDS,queue,
                new ThreadPoolExecutor.DiscardOldestPolicy());

        for (int i = 0; i < 5; i++) {
            MyRunnable1 runnable = new MyRunnable1("Runnable" + (i+1));
            executor.execute(runnable);
        }
        TimeUnit.MILLISECONDS.sleep(50);
        Iterator iterator = queue.iterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            System.out.println(((MyRunnable1)object).getUserName());
        }

        System.out.println("-----------");
        executor.execute(new MyRunnable1("Runnable6"));
        executor.execute(new MyRunnable1("Runnable7"));
        iterator = queue.iterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            System.out.println(((MyRunnable1)object).getUserName());
        }


    }

}
