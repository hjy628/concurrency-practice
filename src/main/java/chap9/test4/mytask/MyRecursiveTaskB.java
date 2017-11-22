package chap9.test4.mytask;

import java.util.Date;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 */
public class MyRecursiveTaskB extends RecursiveTask<Integer>{
    @Override
    protected Integer compute() {
        try {

        System.out.println(Thread.currentThread().getName()+"begin B"+new Date());
        TimeUnit.SECONDS.sleep(5);
        System.out.println(Thread.currentThread().getName()+"end B "+new Date());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return 100;
    }
}
