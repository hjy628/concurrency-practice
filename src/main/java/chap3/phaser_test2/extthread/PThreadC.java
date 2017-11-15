package chap3.phaser_test2.extthread;

import chap3.phaser_test2.tools.PrintTools;

import java.util.concurrent.Phaser;

/**
 * Created by hjy on 17-11-15.
 */
public class PThreadC extends Thread{

    private Phaser phaser;

    public PThreadC(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    @Override
    public void run() {
        PrintTools.methodB();
    }
}
