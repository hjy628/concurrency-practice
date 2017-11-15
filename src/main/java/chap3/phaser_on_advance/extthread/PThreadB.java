package chap3.phaser_on_advance.extthread;


import chap3.phaser_on_advance.service.PService;

import java.util.concurrent.Phaser;

/**
 * Created by hjy on 17-11-15.
 */
public class PThreadB extends Thread{

    private PService service;

    public PThreadB(PService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
