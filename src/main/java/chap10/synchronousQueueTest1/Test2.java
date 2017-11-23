package chap10.synchronousQueueTest1;

import java.sql.Time;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-23.
 */
public class Test2 {

    public static void main(String[] args) throws InterruptedException{


        MyService service = new MyService();

        ThreadPut threadPut = new ThreadPut(service);
        ThreadTake threadTake = new ThreadTake(service);

        threadTake.start();
        TimeUnit.SECONDS.sleep(2);

        threadPut.start();

    }

}
