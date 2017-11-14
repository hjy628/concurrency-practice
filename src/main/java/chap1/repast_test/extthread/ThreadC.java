package chap1.repast_test.extthread;

import chap1.repast_test.service.RepastService;

/**
 * Created by hjy on 17-11-14.
 */
public class ThreadC extends Thread{

    private RepastService service;

    public ThreadC(RepastService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.get();
    }
}
