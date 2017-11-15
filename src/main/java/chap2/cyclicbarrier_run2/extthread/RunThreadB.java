package chap2.cyclicbarrier_run2.extthread;

import chap2.cyclicbarrier_run2.service.RunService2;

/**
 * Created by hjy on 17-11-15.
 */
public class RunThreadB extends Thread{

    private RunService2 service;

    public RunThreadB(RunService2 service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testA();
    }
}
