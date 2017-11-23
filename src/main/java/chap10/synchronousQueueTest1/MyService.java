package chap10.synchronousQueueTest1;

import java.util.concurrent.SynchronousQueue;

/**
 * Created by hjy on 17-11-23.
 */
public class MyService {

    public static SynchronousQueue queue = new SynchronousQueue();

    public void putMethod(){
        try {
            String putString = "anyString" +Math.random();
            System.out.println("put="+putString);
            queue.put(putString);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void takeMethod(){
        try {
            System.out.println("take="+queue.take());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
