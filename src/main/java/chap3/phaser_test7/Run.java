package chap3.phaser_test7;

import chap3.phaser_test7.extthread.PThreadA;
import chap3.phaser_test7.extthread.PThreadB;
import chap3.phaser_test7.extthread.PThreadC;
import chap3.phaser_test7.extthread.PThreadD;

import java.util.concurrent.Phaser;

/**
 * Created by hjy on 17-11-15.
 */
public class Run {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);

        PThreadA a = new PThreadA(phaser);
        a.setName("A");
        a.start();

        PThreadB b = new PThreadB(phaser);
        b.setName("B");
        b.start();

        PThreadC c = new PThreadC(phaser);
        c.setName("C");
        c.start();

        PThreadD d = new PThreadD(phaser);
        d.setName("D");
        d.start();
    }

}
