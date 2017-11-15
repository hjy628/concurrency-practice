package chap2.cyclicbarrier_run1;

import chap2.cyclicbarrier_run1.extthread.RunThreadA;
import chap2.cyclicbarrier_run1.service.RunService1;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by hjy on 17-11-15.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{
        CyclicBarrier barrier = new CyclicBarrier(2);

        RunService1 service = new RunService1(barrier);

        RunThreadA threadA1 = new RunThreadA(service);
        threadA1.setName("A");
        threadA1.start();

        RunThreadA threadA2 = new RunThreadA(service);
        threadA2.setName("B");
        threadA2.start();

        RunThreadA threadA3 = new RunThreadA(service);
        threadA3.setName("C");
        threadA3.start();

        RunThreadA threadA4 = new RunThreadA(service);
        threadA4.setName("D");
        threadA4.start();
    }



}
