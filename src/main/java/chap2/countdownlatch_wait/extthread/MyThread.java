package chap2.countdownlatch_wait.extthread;

import chap2.countdownlatch_wait.service.MyService;

/**
 * Created by hjy on 17-11-14.
 */
public class MyThread extends Thread{
    private MyService service;

    public MyThread(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
