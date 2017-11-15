package chap2.cyclicbarrier_run5.extthread;

import chap2.cyclicbarrier_run5.service.RunService4;

/**
 * Created by hjy on 17-11-15.
 */
public class RunThreadD extends Thread{

    private RunService4 service;

    public RunThreadD(RunService4 service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
