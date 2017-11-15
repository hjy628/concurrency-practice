package chap3.phaser_test1.extthread;

import chap3.phaser_test1.tools.PrintTools;

import java.util.concurrent.Phaser;

/**
 * Created by hjy on 17-11-15.
 */
public class PThreadB extends Thread{

    private Phaser phaser;

    public PThreadB(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    @Override
    public void run() {
        PrintTools.methodA();
    }
}
