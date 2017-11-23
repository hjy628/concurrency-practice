package chap10.linkedTransferQueue_5;


import java.util.Date;
import java.util.concurrent.TimeUnit;

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
        try {

            System.out.println(Thread.currentThread().getName()+" beginA "+new Date());
            System.out.println("tryTransfer(e)返回值为: "+serviceA.queue.tryTransfer("我是元素",5, TimeUnit.SECONDS));
            System.out.println(Thread.currentThread().getName()+" endA "+new Date());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
