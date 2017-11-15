package chap2.cyclicbarrier_awaitafterreset_0;


import chap2.cyclicbarrier_awaitafterreset_0.extthread.ThreadAA;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-14.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

        ThreadAA threadAA1 = new ThreadAA(cyclicBarrier);
        threadAA1.start();
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println(cyclicBarrier.getNumberWaiting());


        ThreadAA threadAA2 = new ThreadAA(cyclicBarrier);
        threadAA2.start();
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println(cyclicBarrier.getNumberWaiting());

        ThreadAA threadAA3 = new ThreadAA(cyclicBarrier);
        threadAA3.start();
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println(cyclicBarrier.getNumberWaiting());

        ThreadAA threadAA4 = new ThreadAA(cyclicBarrier);
        threadAA4.start();
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println(cyclicBarrier.getNumberWaiting());

    }
}
