package chap10.linkedTransferQueue_3;



import java.util.Date;

/**
 * Created by hjy on 17-11-23.
 */
public class ThreadB2 extends Thread{

    private  MyServiceB serviceA;

    public ThreadB2(MyServiceB serviceA) {
        super();
        this.serviceA = serviceA;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+" beginB "+new Date());
            serviceA.queue.transfer("我从ThreadB2来");
            System.out.println(Thread.currentThread().getName()+" endB "+new Date());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
