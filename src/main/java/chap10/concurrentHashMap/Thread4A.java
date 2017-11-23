package chap10.concurrentHashMap;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-23.
 */
public class Thread4A extends Thread{

    private MyService4 service;

    public Thread4A(MyService4 service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
       try {
           Iterator iterator = service.hashtable.keySet().iterator();
           while (iterator.hasNext()){
               System.out.println(iterator.next());
               TimeUnit.SECONDS.sleep(3);
           }
       }catch (InterruptedException e){
           e.printStackTrace();
       }
    }
}
