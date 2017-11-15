package chap2.cyclicbarrier_run1.extthread;

import chap2.cyclicbarrier_run1.service.RunService1;

/**
 * Created by hjy on 17-11-15.
 */
public class RunThreadA extends Thread{

    private RunService1 service;

    public RunThreadA(RunService1 service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.beinRun();
    }
}
