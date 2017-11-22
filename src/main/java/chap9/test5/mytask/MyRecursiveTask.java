package chap9.test5.mytask;

import java.util.Date;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 */
public class MyRecursiveTask extends RecursiveTask<String>{

    private int beginValue;
    private int endValue;

    public MyRecursiveTask(int beginValue, int endValue) {
        this.beginValue = beginValue;
        this.endValue = endValue;
    }

    @Override
    protected String compute() {

        System.out.println(Thread.currentThread().getName() + "-------------");

        if (endValue - beginValue >2){
            int middleValue = (endValue+beginValue)/2;

            MyRecursiveTask leftTask = new MyRecursiveTask(beginValue,middleValue);
            MyRecursiveTask rightTask = new MyRecursiveTask(middleValue+1,endValue);
            invokeAll(leftTask,rightTask);

            return leftTask.join() + rightTask.join();
        }else {
            String returnString = "";
            for (int i = beginValue; i <= endValue; i++) {
                returnString = returnString + (i);
            }
            System.out.println("else 返回："+returnString + "    " +beginValue + "  "+endValue);
            return returnString;
        }

    }
}
