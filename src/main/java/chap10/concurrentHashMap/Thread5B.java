package chap10.concurrentHashMap;

/**
 * Created by hjy on 17-11-23.
 */
public class Thread5B extends Thread{

    private MyService5 service;

    public Thread5B(MyService5 service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
       service.map.put("z","zValue");
    }
}
