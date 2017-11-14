package chap1.semaphore_acquireuninterruptibly_1.test;

import chap1.semaphore_acquireuninterruptibly_1.exthread.ThreadA;
import chap1.semaphore_acquireuninterruptibly_1.exthread.ThreadB;
import chap1.semaphore_acquireuninterruptibly_1.service.Service;

import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-14.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();

        TimeUnit.SECONDS.sleep(1);
        b.interrupt();
        System.out.println("main中断了a");
    }

}
