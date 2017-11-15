package chap2.countdownlatch_count;


import java.util.concurrent.CountDownLatch;

/**
 * Created by hjy on 17-11-14.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException{
        CountDownLatch countDownLatch = new CountDownLatch(3);
        System.out.println("main getCount1="+countDownLatch.getCount());
        countDownLatch.countDown();
        System.out.println("main getCount2="+countDownLatch.getCount());
        countDownLatch.countDown();
        System.out.println("main getCount3="+countDownLatch.getCount());
        countDownLatch.countDown();
        System.out.println("main getCount4="+countDownLatch.getCount());
        countDownLatch.countDown();
        System.out.println("main getCount5="+countDownLatch.getCount());
        countDownLatch.countDown();
        System.out.println("main getCount6="+countDownLatch.getCount());

    }
}
