package chap2.countdownlatch_test2_3_ext;

import chap2.countdownlatch_test2_3_ext.extthread.MyThread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-14.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{
        try {
            CountDownLatch comingTag = new CountDownLatch(10);
            CountDownLatch waitTag = new CountDownLatch(1);
            CountDownLatch waitRunTag = new CountDownLatch(10);
            CountDownLatch beginTag = new CountDownLatch(1);
            CountDownLatch endTag = new CountDownLatch(10);

            MyThread[] threadArray = new MyThread[10];
            for (int i = 0; i < threadArray.length; i++) {
                threadArray[i] = new MyThread(comingTag,waitTag,waitRunTag,beginTag,endTag);
                threadArray[i].start();
            }

            System.out.println("裁判员在等待选手的到来!");
            comingTag.await();
            System.out.println("裁判员看到所有选手来了，各就各位前巡视用时5秒!");
            TimeUnit.SECONDS.sleep(5);
            waitTag.countDown();
            System.out.println("各就各位");
            waitRunTag.await();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("发令枪响起");
            beginTag.countDown();
            endTag.await();
            System.out.println("所有运动员到达，统计比赛名次!");

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
