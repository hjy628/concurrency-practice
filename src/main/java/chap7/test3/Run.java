package chap7.test3;

import chap7.test3.mycallable.MycallableA;
import chap7.test3.mycallable.MycallableB;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by hjy on 17-11-20.
 * 成功取得returnA字符串，线程B中断了，但抛出的空指针异常却没有在控制台输出
 */
public class Run {

    public static void main(String[] args) {

        try {
            List list = new ArrayList();
            list.add(new MycallableA());
            list.add(new MycallableB());

            ExecutorService service = Executors.newCachedThreadPool();
            String getString = (String)service.invokeAny(list);
            System.out.println("llllllllll="+getString);
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            e.printStackTrace();
        }
    }


}
