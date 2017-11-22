package chap9.method16.mytask;

import java.util.concurrent.RecursiveTask;

/**
 * Created by hjy on 17-11-22.
 *
 */
public class MyRecursiveTask3 extends RecursiveTask<Integer> {
    private int beginPosition;
    private int endPosition;

    public MyRecursiveTask3(int beginPosition, int endPosition) {
        super();
        this.beginPosition = beginPosition;
        this.endPosition = endPosition;
    }


    @Override
    protected Integer compute() {

        Integer sumValue = 0;


        if ((endPosition - beginPosition) > 2 ) {
            int middleNum = (endPosition + beginPosition) / 2;
            MyRecursiveTask3 leftTask = new MyRecursiveTask3(beginPosition, middleNum);
            MyRecursiveTask3 rightTask = new MyRecursiveTask3(middleNum + 1, endPosition);

            invokeAll(leftTask,rightTask);

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
