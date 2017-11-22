package chap9.method4.mytask;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 */
public class MyRecursiveTask extends RecursiveTask<String>{
    @Override
    protected String compute() {
        try {
            TimeUnit.SECONDS.sleep(5);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "我是返回值";
    }
}
