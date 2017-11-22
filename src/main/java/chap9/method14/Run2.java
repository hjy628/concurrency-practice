package chap9.method14;

import chap9.method14.mytask.MyRecursiveTask;

import java.util.concurrent.ForkJoinPool;

/**
 * Created by hjy on 17-11-22.
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException{
        ForkJoinPool pool = new ForkJoinPool();
        String returnString = pool.invoke(new MyRecursiveTask());
        System.out.println(returnString);
    }

}
