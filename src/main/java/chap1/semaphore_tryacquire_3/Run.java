package chap1.semaphore_tryacquire_3;

import chap1.semaphore_tryacquire_3.exthread.ThreadA;
import chap1.semaphore_tryacquire_3.exthread.ThreadB;
import chap1.semaphore_tryacquire_3.myservice.MyService;

/**
 * Created by hjy on 17-11-14.
 */
public class Run {

    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
