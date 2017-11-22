package chap9.method14;

import chap9.method14.action.MyRecursiveAction;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 */
public class Run1 {

    public static void main(String[] args) throws InterruptedException{
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new MyRecursiveAction());

    }

}
