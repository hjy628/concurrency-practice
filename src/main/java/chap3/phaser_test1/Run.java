package chap3.phaser_test1;

import chap3.phaser_test1.extthread.PThreadA;
import chap3.phaser_test1.extthread.PThreadB;
import chap3.phaser_test1.extthread.PThreadC;
import chap3.phaser_test1.tools.PrintTools;

import java.util.concurrent.Phaser;

/**
 * Created by hjy on 17-11-15.
 */
public class Run {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        PrintTools.phaser = phaser;

        PThreadA a = new PThreadA(phaser);
        a.setName("A");
        a.start();

        PThreadB b = new PThreadB(phaser);
        b.setName("B");
        b.start();

        PThreadC c = new PThreadC(phaser);
        c.setName("C");
        c.start();
    }

}
