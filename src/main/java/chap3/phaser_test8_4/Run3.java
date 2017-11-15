package chap3.phaser_test8_4;

import chap3.phaser_test8_4.extthread.PThreadA;

import java.util.Date;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-15.
 */
public class Run3 {

    public static void main(String[] args) throws InterruptedException{
        Phaser phaser = new Phaser(3);

        PThreadA a = new PThreadA(phaser);
        a.setName("A");
        a.start();

        TimeUnit.SECONDS.sleep(1);
        a.interrupt();

    }

}
