package chap1.t11.test;

import chap1.t11.exthread.ThreadA;
import chap1.t11.exthread.ThreadB;
import chap1.t11.exthread.ThreadC;
import chap1.t11.service.Service;

/**
 * Created by hjy on 17-11-14.
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        ThreadC c = new ThreadC(service);
        c.setName("C");
        a.start();
        b.start();
        c.start();
    }
}
