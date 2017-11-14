package chap1.exchanger_3;

import chap1.exchanger_3.extthread.ThreadA;

import java.util.concurrent.Exchanger;

/**
 * Created by hjy on 17-11-14.
 */
public class Run {

    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<String>();
        ThreadA a = new ThreadA(exchanger);
        a.start();
        System.out.println("main end!");
    }

}
