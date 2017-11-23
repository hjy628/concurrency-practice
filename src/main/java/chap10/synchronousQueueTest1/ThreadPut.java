package chap10.synchronousQueueTest1;



/**
 * Created by hjy on 17-11-23.
 */
public class ThreadPut extends Thread{

    private MyService service;

    public ThreadPut(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            service.putMethod();
        }
    }
}
