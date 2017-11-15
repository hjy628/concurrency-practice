package chap3.phaser_test6_2.extthread;


import chap3.phaser_test6_2.service.MyService;

/**
 * Created by hjy on 17-11-15.
 */
public class PThreadA extends Thread{

    private MyService service;


    public PThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethodA();
    }
}
