package chap10.linkedTransferQueue_4;


import java.util.Date;

/**
 * Created by hjy on 17-11-23.
 */
public class ThreadB1 extends Thread{

    private MyServiceB serviceA;

    public ThreadB1(MyServiceB serviceA) {
        super();
        this.serviceA = serviceA;
    }

    @Override
    public void run() {
            System.out.println(Thread.currentThread().getName()+" beginA "+new Date());
            System.out.println("tryTransfer(e)返回值为: "+serviceA.queue.tryTransfer("我是数据"));
            System.out.println(Thread.currentThread().getName()+" endA "+new Date());
    }
}
