package chap2.countdownlatch_test1;

import chap2.countdownlatch_test1.extthread.MyThread;
import chap2.countdownlatch_test1.service.MyService;

import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-14.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{
        MyService service = new MyService();
        MyThread t = new MyThread(service);
        t.start();
        TimeUnit.SECONDS.sleep(2);
        service.downMethod();
    }

}
