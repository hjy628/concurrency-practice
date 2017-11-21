package chap7.test6;

import chap7.test6.mycallable.MycallableA;
import chap7.test6.mycallable.MycallableB;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by hjy on 17-11-20.
 *  线程A中断了，但并没有在控制台输出空指针异常相关的信息，所以最后对线程B的返回值进行输出，因为线程B并没有出现异常
 */
public class Run {

    public static void main(String[] args) {

        try {
            List list = new ArrayList();
            list.add(new MycallableB());
            list.add(new MycallableA());

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
