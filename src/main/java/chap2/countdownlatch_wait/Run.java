package chap2.countdownlatch_wait;

import chap2.countdownlatch_wait.extthread.MyThread;
import chap2.countdownlatch_wait.service.MyService;

/**
 * Created by hjy on 17-11-14.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException{
        MyService service = new MyService();
        MyThread[] threadArray = new MyThread[3];
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i] = new MyThread(service);
        }
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i].start();
        }
    }
}
