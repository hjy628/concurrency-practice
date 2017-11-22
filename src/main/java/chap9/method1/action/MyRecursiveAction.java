package chap9.method1.action;

import java.util.concurrent.RecursiveAction;

/**
 * Created by hjy on 17-11-22.
 */
public class MyRecursiveAction extends RecursiveAction{
    @Override
    protected void compute() {
        System.out.println("ThreadName="+Thread.currentThread().getName());
    }
}
