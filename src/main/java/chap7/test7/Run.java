package chap7.test7;


import chap7.test7.mycallable.MycallableA;
import chap7.test7.mycallable.MycallableB;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by hjy on 17-11-20.
 *
 */
public class Run {

    public static void main(String[] args) {

        try {
            List list = new ArrayList();
            list.add(new MycallableA());
            list.add(new MycallableB());

            ExecutorService service = Executors.newCachedThreadPool();
            String getString = (String)service.invokeAny(list);
            System.out.println("main取得的返回值="+getString);
        }catch (InterruptedException e){
            System.out.println("main InterruptedException");
            e.printStackTrace();
        }catch (ExecutionException e){
            System.out.println("main ExecutionException");
            e.printStackTrace();
        }
    }


}
