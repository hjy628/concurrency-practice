package chap10.concurrentHashMap;

/**
 * Created by hjy on 17-11-23.
 */
public class Thread3B extends Thread{

    private MyService3 service;

    public Thread3B(MyService3 service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500000; i++) {
            service.map.put("ThreadB"+(i+1),"ThreadB"+i+1);
            System.out.println("ThreadB"+(i+1));
        }
    }
}
