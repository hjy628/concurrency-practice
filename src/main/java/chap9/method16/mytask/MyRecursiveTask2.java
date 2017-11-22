package chap9.method16.mytask;

import chap9.forkjoin_3.mytask.MyRecursiveTask;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-22.
 *  leftTask.fork();
 rightTask.fork(); 创建了太多的线程
 *
 */
public class MyRecursiveTask2 extends RecursiveTask<Integer> {
    private int beginPosition;
    private int endPosition;

    public MyRecursiveTask2(int beginPosition, int endPosition) {
        super();
        this.beginPosition = beginPosition;
        this.endPosition = endPosition;
    }


    @Override
    protected Integer compute() {

        Integer sumValue = 0;


        if ((endPosition - beginPosition) > 2 ) {
            int middleNum = (endPosition + beginPosition) / 2;
            MyRecursiveTask2 leftTask = new MyRecursiveTask2(beginPosition, middleNum);
            MyRecursiveTask2 rightTask = new MyRecursiveTask2(middleNum + 1, endPosition);

            leftTask.fork();
            rightTask.fork();

            Integer leftValue = leftTask.join();
            Integer rightValue = rightTask.join();

            return leftValue + rightValue;
        } else {
            int count = 0;
            for (int i = beginPosition; i <= endPosition; i++) {
                count = count +i;
            }
            return count;
        }
    }
}
