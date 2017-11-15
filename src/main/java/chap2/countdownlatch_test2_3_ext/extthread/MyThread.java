package chap2.countdownlatch_test2_3_ext.extthread;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-14.
 */
public class MyThread extends Thread{

    private CountDownLatch comingTag;   //裁判等待所有运动员到来
    private CountDownLatch waitTag;   //等待裁判说准备开始
    private CountDownLatch waitRunTag;   //等待起跑
    private CountDownLatch beginTag;   //起跑
    private CountDownLatch endTag;   //所有运动员到达终点

    public MyThread(CountDownLatch comingTag, CountDownLatch waitTag, CountDownLatch waitRunTag, CountDownLatch beginTag, CountDownLatch endTag) {
        super();
        this.comingTag = comingTag;
        this.waitTag = waitTag;
        this.waitRunTag = waitRunTag;
        this.beginTag = beginTag;
        this.endTag = endTag;
    }

    @Override
    public void run() {
       try {
           System.out.println("运动员使用不同交通工具不同速度到达起跑点正向这边走");
           TimeUnit.SECONDS.sleep((int)(Math.random()*10));
           System.out.println(Thread.currentThread().getName()+"到达起跑点了");
           comingTag.countDown();
           System.out.println("等待裁判说准备");
           waitTag.await();
           System.out.println("各就各位，准备起跑姿势");
           TimeUnit.SECONDS.sleep((int)(Math.random()*10));
           waitRunTag.countDown();
           beginTag.await();
           System.out.println(Thread.currentThread().getName()+"运动员起跑，并且跑赛过程用时不确定");
           TimeUnit.SECONDS.sleep((int)(Math.random()*10));
           endTag.countDown();
           System.out.println(Thread.currentThread().getName()+"运动员到达终点");

       }catch (InterruptedException e){
           e.printStackTrace();
       }

    }
}
