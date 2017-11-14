package chap1.semaphore_moretoone_1.myservice;

import java.util.concurrent.Semaphore;

/**
 * Created by hjy on 17-11-14.
 */
public class MyService {
    private Semaphore semaphore = new Semaphore(3);

    public void sayHello(){
        try {
            semaphore.acquire();
            System.out.println("ThreadName"+Thread.currentThread().getName()+"准备");
            System.out.println("begin hello "+System.currentTimeMillis());
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+"打印"+(i+1));
            }
            System.out.println("end hello "+System.currentTimeMillis());
            semaphore.release();
            System.out.println("ThreadName"+Thread.currentThread().getName()+"结束");
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
    }
}
