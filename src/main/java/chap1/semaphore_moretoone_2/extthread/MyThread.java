package chap1.semaphore_moretoone_2.extthread;

import chap1.semaphore_moretoone_2.myservice.MyService;

/**
 * Created by hjy on 17-11-14.
 */
public class MyThread extends Thread{

    private MyService myService;

    public MyThread(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.sayHello();
    }
}
