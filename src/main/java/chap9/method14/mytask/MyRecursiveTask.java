package chap9.method14.mytask;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 */
public class MyRecursiveTask extends RecursiveTask<String>{
    @Override
    protected String compute() {
        return "我是返回值";
    }
}
