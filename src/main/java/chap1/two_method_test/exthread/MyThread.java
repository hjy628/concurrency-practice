package chap1.two_method_test.exthread;


import chap1.two_method_test.myservice.MyService;

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
        myService.testMethod();
    }
}
