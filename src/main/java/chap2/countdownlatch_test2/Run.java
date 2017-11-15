package chap2.countdownlatch_test2;

import chap2.countdownlatch_test2.extthread.MyThread;
import chap2.countdownlatch_test2.service.MyService;

import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-14.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{
        MyService service = new MyService();
        MyThread[] tArray = new MyThread[10];
        for (int i = 0; i < tArray.length; i++) {
            tArray[i] = new MyThread(service);
            tArray[i].setName("线程"+(i+1));
            tArray[i].start();
        }
        TimeUnit.SECONDS.sleep(2);
        service.downMethod();
    }

}
