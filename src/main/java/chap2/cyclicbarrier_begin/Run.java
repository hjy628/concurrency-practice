package chap2.cyclicbarrier_begin;


import chap2.cyclicbarrier_begin.extthread.MyThread;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by hjy on 17-11-14.
 */
public class Run {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("全部到了!");
            }
        });
        MyThread[] threadArray = new MyThread[5];
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i] = new MyThread(cyclicBarrier);
        }
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i].start();
        }
    }
}
