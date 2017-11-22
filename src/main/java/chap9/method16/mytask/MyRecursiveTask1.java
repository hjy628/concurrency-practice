package chap9.method16.mytask;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 */
public class MyRecursiveTask1 extends RecursiveAction{


    @Override
    protected void compute() {
        try {
            System.out.println("begin= "+Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(2);
            System.out.println("end= "+Thread.currentThread().getName());
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
