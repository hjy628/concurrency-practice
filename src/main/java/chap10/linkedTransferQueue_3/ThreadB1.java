package chap10.linkedTransferQueue_3;


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
        try {
            System.out.println(Thread.currentThread().getName()+" beginA "+new Date());
            System.out.println("取得的值: "+serviceA.queue.take());
            System.out.println(Thread.currentThread().getName()+" endA "+new Date());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
