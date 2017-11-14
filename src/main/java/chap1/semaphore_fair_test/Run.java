package chap1.semaphore_fair_test;

import chap1.semaphore_fair_test.extthread.MyThread;
import chap1.semaphore_fair_test.myservice.MyService;

/**
 * Created by hjy on 17-11-14.
 */
public class Run {

    public static void main(String[] args) {
        MyService service = new MyService();

        MyThread firstThread = new MyThread(service);
        firstThread.start();
        MyThread[] threadArray = new MyThread[4];
        for (int i = 0; i < 4; i++) {
            threadArray[i]=new MyThread(service);
            threadArray[i].start();
        }
    }

}
