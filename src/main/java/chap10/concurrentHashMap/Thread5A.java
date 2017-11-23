package chap10.concurrentHashMap;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-23.
 */
public class Thread5A extends Thread{

    private MyService5 service;

    public Thread5A(MyService5 service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
       try {
           Iterator iterator = service.map.keySet().iterator();
           while (iterator.hasNext()){
               System.out.println(iterator.next());
               TimeUnit.SECONDS.sleep(3);
           }
       }catch (InterruptedException e){
           e.printStackTrace();
       }
    }
}
