package chap3.phaser_test8_4;

import chap3.phaser_test8_4.extthread.PThreadA;

import java.util.concurrent.Phaser;

/**
 * Created by hjy on 17-11-15.
 */
public class Run1 {

    public static void main(String[] args) throws InterruptedException{
        Phaser phaser = new Phaser(3);

        PThreadA a = new PThreadA(phaser);
        a.setName("A");
        a.start(); 

    }

}
