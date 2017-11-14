package chap1.semaphore_tryacquire_2.exthread;


import chap1.semaphore_tryacquire_2.myservice.MyService;


/**
 * Created by hjy on 17-11-14.
 */
public class ThreadA extends Thread{
    private MyService service;

    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
