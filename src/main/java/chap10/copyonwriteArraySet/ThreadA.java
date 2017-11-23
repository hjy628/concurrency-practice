package chap10.copyonwriteArraySet;

/**
 * Created by hjy on 17-11-23.
 */
public class ThreadA extends Thread{

    private MyServiceA service;

    public ThreadA(MyServiceA service) {
        super();
        this.service = service;
    }


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            service.set.add(Thread.currentThread().getName()+"anyString"+(i+1));

        }
    }
}
