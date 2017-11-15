package chap2.cyclicbarrier_run2;

import chap2.cyclicbarrier_run2.extthread.RunThreadB;
import chap2.cyclicbarrier_run2.service.RunService2;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by hjy on 17-11-15.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {

        int parties = 4;

        CyclicBarrier barrier = new CyclicBarrier(parties, new Runnable() {
            @Override
            public void run() {
                System.out.println("都到了!");
            }
        });

        RunService2 service = new RunService2(barrier);

        RunThreadB[] threadArray = new RunThreadB[4];

        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i] = new RunThreadB(service);
            threadArray[i].start();
        }
    }



}
