package chap2.cyclicbarrier_thread_big_parites;


import chap2.cyclicbarrier_thread_big_parites.extthread.MyThread;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-14.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new Runnable() {
            @Override
            public void run() {
                System.out.println("全部到了!");
            }
        });

        for (int i = 0; i < 4; i++) {
          MyThread thread = new MyThread(cyclicBarrier);
            thread.start();
            TimeUnit.SECONDS.sleep(2);
        }

    }
}
