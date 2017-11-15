package chap3.phaser_test_a;

import chap3.phaser_test_a.extthread.PThreadA;

import java.util.concurrent.Phaser;

/**
 * Created by hjy on 17-11-15.
 */
public class Run1 {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);

        for (int i = 0; i < 3; i++) {
            PThreadA t = new PThreadA(phaser);
            t.start();
        }
    }


}
