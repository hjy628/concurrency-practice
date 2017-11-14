package chap1.repast_test.extthread;


import chap1.repast_test.service.RepastService;

/**
 * Created by hjy on 17-11-14.
 */
public class ThreadP extends Thread{

    private RepastService service;

    public ThreadP(RepastService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.set();
    }
}
