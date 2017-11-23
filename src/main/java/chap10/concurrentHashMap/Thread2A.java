package chap10.concurrentHashMap;

/**
 * Created by hjy on 17-11-23.
 */
public class Thread2A extends Thread{

    private MyService2 service;

    public Thread2A(MyService2 service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500000; i++) {
            service.map.put("ThreadA"+(i+1),"ThreadA"+i+1);
            System.out.println("ThreadA"+(i+1));
        }
    }
}
