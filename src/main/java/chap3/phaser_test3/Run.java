package chap3.phaser_test3;

import chap3.phaser_test3.extthread.PThreadA;
import java.util.concurrent.Phaser;

/**
 * Created by hjy on 17-11-15.
 */
public class Run {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);

        PThreadA a = new PThreadA(phaser);
        a.setName("A");
        a.start();


    }

}
