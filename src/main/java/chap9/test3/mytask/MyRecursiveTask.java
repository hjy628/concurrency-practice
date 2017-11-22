package chap9.test3.mytask;

import java.util.Date;
import java.util.concurrent.RecursiveTask;

/**
 * Created by hjy on 17-11-22.
 */
public class MyRecursiveTask extends RecursiveTask<Integer>{
    @Override
    protected Integer compute() {
        System.out.println("compute time= "+new Date());
        return 100;
    }
}
