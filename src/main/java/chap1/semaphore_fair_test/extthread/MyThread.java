package chap1.semaphore_fair_test.extthread;

import chap1.semaphore_fair_test.myservice.MyService;

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
        System.out.println("ThreadName" + this.getName() + "启动了!");
        myService.testMethod();
    }
}
