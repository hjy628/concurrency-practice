package chap1.t12.exthread;

import chap1.t12.service.Service;

/**
 * Created by hjy on 17-11-14.
 */
public class ThreadA extends Thread{
    private Service service;

    public ThreadA( Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
