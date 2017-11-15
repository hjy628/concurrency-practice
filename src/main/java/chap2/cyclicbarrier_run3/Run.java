package chap2.cyclicbarrier_run3;

import chap2.cyclicbarrier_run3.extthread.RunThreadC;
import chap2.cyclicbarrier_run3.extthread.RunThreadD;
import chap2.cyclicbarrier_run3.extthread.RunThreadE;
import chap2.cyclicbarrier_run3.service.RunService3;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by hjy on 17-11-15.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {


        RunService3 service = new RunService3();
        RunThreadC c= new RunThreadC(service);
        c.start();
        RunThreadD d= new RunThreadD(service);
        d.start();
    }



}
