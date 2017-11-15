package chap2.cyclicbarrier_run4.extthread;

import chap2.cyclicbarrier_run4.service.RunService4;

/**
 * Created by hjy on 17-11-15.
 */
public class RunThreadE extends Thread{

    private RunService4 service;

    public RunThreadE(RunService4 service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
