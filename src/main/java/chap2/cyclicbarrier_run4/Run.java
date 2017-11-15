package chap2.cyclicbarrier_run4;

import chap2.cyclicbarrier_run4.extthread.RunThreadC;
import chap2.cyclicbarrier_run4.extthread.RunThreadD;
import chap2.cyclicbarrier_run4.extthread.RunThreadE;
import chap2.cyclicbarrier_run4.service.RunService4;

import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-15.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {


        RunService4 service = new RunService4();
        RunThreadC c= new RunThreadC(service);
        c.setName("C");
        RunThreadD d= new RunThreadD(service);
        d.setName("D");
        RunThreadE e= new RunThreadE(service);
        e.setName("E");
        d.start();
        e.start();
        c.start();

        TimeUnit.SECONDS.sleep(2);
        System.out.println("屏障对象的parties个数为: " + service.barrier.getParties());
        System.out.println("屏障处等待的线程个数为: " + service.barrier.getNumberWaiting());
    }



}
