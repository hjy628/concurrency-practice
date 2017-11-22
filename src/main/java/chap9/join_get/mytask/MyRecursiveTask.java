package chap9.join_get.mytask;

import java.util.Date;
import java.util.concurrent.RecursiveTask;

/**
 * Created by hjy on 17-11-22.
 */
public class MyRecursiveTask extends RecursiveTask<Integer>{
    @Override
    protected Integer compute() {
        System.out.println(Thread.currentThread().getName()+"compute time= "+new Date());
        String nullString = null;
        nullString.toString();
        return 100;
    }
}
