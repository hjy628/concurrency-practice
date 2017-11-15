package chap2.countdownlatch_test3;

import chap2.countdownlatch_test3.extthread.MyThread;

import java.util.concurrent.CountDownLatch;

/**
 * Created by hjy on 17-11-14.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{


        CountDownLatch maxRunner = new CountDownLatch(10);
        MyThread[] tArray = new MyThread[Integer.parseInt(""+maxRunner.getCount())];
        for (int i = 0; i < tArray.length; i++) {
            tArray[i] = new MyThread(maxRunner);
            tArray[i].setName("线程"+(i+1));
            tArray[i].start();
        }
        maxRunner.await();
        System.out.println(maxRunner.getCount());
        System.out.println("都回来了");


    }

}
