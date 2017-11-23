package chap10.concurrentHashMap;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-23.
 */
public class Thread4B extends Thread{

    private MyService4 service;

    public Thread4B(MyService4 service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
       service.hashtable.put("z","zValue");
    }
}
