package chap9.test2.action;

import java.util.concurrent.RecursiveAction;

/**
 * Created by hjy on 17-11-22.
 */
public class MyRecursiveAction extends RecursiveAction{

    private int beginValue;
    private int endValue;

    public MyRecursiveAction(int beginValue, int endValue) {
        this.beginValue = beginValue;
        this.endValue = endValue;
    }

    @Override
    protected void compute() {
        System.out.println(Thread.currentThread().getName()+"----------------------------");
        if (endValue-beginValue>2){
            int middleNum = (beginValue+endValue)/2;
            MyRecursiveAction leftAction = new MyRecursiveAction(beginValue,middleNum);
            MyRecursiveAction rightAction = new MyRecursiveAction(middleNum,endValue);
            this.invokeAll(leftAction,rightAction);
        }else {
            System.out.println("打印组合为: "+beginValue+"--"+endValue);
        }
    }
}
