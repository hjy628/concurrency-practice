package chap9.method17.mytask;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 */
public class MyRecursiveTask1 extends RecursiveAction{
    int i = 0;


    @Override
    protected void compute() {
            System.out.println("beginA= "+Thread.currentThread().getName());
            while (i<100000){
                String newString = new String();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
            }
            System.out.println("endA= "+Thread.currentThread().getName());


    }
}
