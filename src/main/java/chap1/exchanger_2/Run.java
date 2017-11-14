package chap1.exchanger_2;

import chap1.exchanger_2.extthread.ThreadA;
import chap1.exchanger_2.extthread.ThreadB;

import java.util.concurrent.Exchanger;

/**
 * Created by hjy on 17-11-14.
 */
public class Run {

    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<String>();
        ThreadA a = new ThreadA(exchanger);
        ThreadB b = new ThreadB(exchanger);
        a.start();
        b.start();
    }

}
