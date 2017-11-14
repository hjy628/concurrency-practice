package chap1.semaphore_acquireuninterruptibly_1.exthread;


import chap1.semaphore_acquireuninterruptibly_1.service.Service;

/**
 * Created by hjy on 17-11-14.
 */
public class ThreadB extends Thread{
    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
