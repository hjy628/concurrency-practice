package chap3.phaser_test_a;

import chap3.phaser_test_a.extthread.PThreadA;

import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-15.
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException{
        Phaser phaser = new Phaser(3);
        phaser.register();

        for (int i = 0; i < 3; i++) {
            PThreadA t = new PThreadA(phaser);
            t.start();
        }

        TimeUnit.SECONDS.sleep(5);
        phaser.arriveAndDeregister();
    }


}
