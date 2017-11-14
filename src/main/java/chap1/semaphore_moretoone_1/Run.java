package chap1.semaphore_moretoone_1;

import chap1.semaphore_moretoone_1.extthread.MyThread;
import chap1.semaphore_moretoone_1.myservice.MyService;

/**
 * Created by hjy on 17-11-14.
 */
public class Run {

    public static void main(String[] args) {
        MyService service = new MyService();

        MyThread[] threadArray = new MyThread[12];
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i]=new MyThread(service);
            threadArray[i].start();
        }
    }

}
