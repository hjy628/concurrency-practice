package chap4.test26;

import chap4.test26.myrunnable.MyRunnableA;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run1 {

    public static void main(String[] args) throws InterruptedException{
        MyRunnableA a1 = new MyRunnableA("A1");
        MyRunnableA a2 = new MyRunnableA("A2");
        MyRunnableA a3 = new MyRunnableA("A3");
        MyRunnableA a4 = new MyRunnableA("A4");
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,10,30, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        executor.execute(a1);
        executor.execute(a2);
        executor.execute(a3);
        executor.execute(a4);
        TimeUnit.SECONDS.sleep(1);

        executor.shutdown();

        System.out.println("main end!");
    }

}
