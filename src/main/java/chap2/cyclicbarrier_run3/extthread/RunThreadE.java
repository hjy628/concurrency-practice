package chap2.cyclicbarrier_run3.extthread;

import chap2.cyclicbarrier_run3.service.RunService3;

/**
 * Created by hjy on 17-11-15.
 */
public class RunThreadE extends Thread{

    private RunService3 service;

    public RunThreadE(RunService3 service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
