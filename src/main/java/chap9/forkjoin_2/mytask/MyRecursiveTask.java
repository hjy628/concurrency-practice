package chap9.forkjoin_2.mytask;

import java.util.concurrent.RecursiveTask;

/**
 * Created by hjy on 17-11-22.
 * 核心条件是 if ((endPosition - beginPosition) != 0)  也就是想实现以1+2+3+4+5...的方式累加到10
 */
public class MyRecursiveTask extends RecursiveTask<Integer>{

    private int beginPosition;
    private int endPosition;

    public MyRecursiveTask(int beginPosition, int endPosition) {
        super();
        this.beginPosition = beginPosition;
        this.endPosition = endPosition;
        System.out.println("# "+(beginPosition + " "+ endPosition));
    }

    @Override
    protected Integer compute() {

        System.out.println(Thread.currentThread().getName() + "-------------");

        Integer sumValue = 0;

        System.out.println("compute=" + beginPosition + " " + endPosition);

        if ((endPosition - beginPosition) != 0) {
            System.out.println("!=0");
            int middleNum = (endPosition + beginPosition) / 2;
            System.out.println("left 传入的值：" + (beginPosition + " " + middleNum));
            MyRecursiveTask leftTask = new MyRecursiveTask(beginPosition, middleNum);
            System.out.println("right 传入的值：" + (middleNum + 1 + " " + endPosition));
            MyRecursiveTask rightTask = new MyRecursiveTask(middleNum + 1, endPosition);
            invokeAll(leftTask, rightTask);

            Integer leftValue = leftTask.join();
            Integer rightValue = rightTask.join();

            return leftValue + rightValue;
        } else {
            return endPosition;
        }
    }

}
