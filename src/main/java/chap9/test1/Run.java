package chap9.test1;

import chap9.test1.action.MyRecursiveAction;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(new MyRecursiveAction());
        TimeUnit.SECONDS.sleep(5);
    }

}
