package chap2.cyclicbarrier_run5;

import chap2.cyclicbarrier_run5.extthread.RunThreadC;
import chap2.cyclicbarrier_run5.extthread.RunThreadD;
import chap2.cyclicbarrier_run5.extthread.RunThreadE;
import chap2.cyclicbarrier_run5.service.RunService4;

import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-15.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {


        RunService4 service = new RunService4();
        RunThreadD d= new RunThreadD(service);
        d.setName("D");
        RunThreadE e= new RunThreadE(service);
        e.setName("E");
        d.start();
        e.start();

        //线程C未实例化
        TimeUnit.SECONDS.sleep(2);
        service.barrier.reset();
    }



}
