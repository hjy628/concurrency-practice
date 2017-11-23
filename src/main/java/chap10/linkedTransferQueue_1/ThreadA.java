package chap10.linkedTransferQueue_1;


import java.util.Date;

/**
 * Created by hjy on 17-11-23.
 */
public class ThreadA extends Thread{

    private MyServiceA serviceA;

    public ThreadA(MyServiceA serviceA) {
        super();
        this.serviceA = serviceA;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+" begin "+new Date());
            System.out.println("取得的值: "+serviceA.queue.take());
            System.out.println(Thread.currentThread().getName()+" end "+new Date());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
