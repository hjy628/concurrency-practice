package chap3.phaser_test8_2;

import chap3.phaser_test8_2.extthread.PThreadA;

import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-15.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{
        Phaser phaser = new Phaser(3);

        PThreadA a = new PThreadA(phaser);
        a.setName("A");
        a.start();

        TimeUnit.SECONDS.sleep(5);
        a.interrupt();
        System.out.println("中断了c");

    }

}
