package chap5.future_last;

import chap5.future_last.mycallable.MyCallable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by hjy on 17-11-20.
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyCallable callable1 = new MyCallable("username1",5000);
            MyCallable callable2 = new MyCallable("username2",4000);
            MyCallable callable3 = new MyCallable("username3",3000);
            MyCallable callable4 = new MyCallable("username4",2000);
            MyCallable callable5 = new MyCallable("username5",1000);

            List<Callable> callableList = new ArrayList<Callable>();
            callableList.add(callable1);
            callableList.add(callable2);
            callableList.add(callable3);
            callableList.add(callable4);
            callableList.add(callable5);
            List<Future> futureList = new ArrayList<Future>();

            ThreadPoolExecutor executor = new ThreadPoolExecutor(5,10,5, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
            for (int i = 0; i < 5; i++) {
                futureList.add(executor.submit(callableList.get(i)));
            }
            System.out.println("run first time = "+new Date());

            for (int i = 0; i < 5; i++) {
                System.out.println(futureList.get(i).get() + "   "+new Date());
            }


            //按顺序打印的效果
            //说明一个Future对应指定的一个Callable

        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            e.printStackTrace();
        }
    }


}
