package chap9.forkjointask_method2.mytask;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 * 在catch语句块中需要抛出NumberFormatException异常，MyRecursiveTask对象从而可以获得任务执行结果的情况
 */
public class MyRecursiveTask extends RecursiveTask<Integer>{
    @Override
    protected Integer compute() {
        try {
            TimeUnit.SECONDS.sleep(1);
            Integer.parseInt("a");
        }catch (NumberFormatException e){
            e.printStackTrace();
            throw  e;
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return 100;
    }
}
