package chap7.test3;

import chap7.test3.mycallable.MycallableA;
import chap7.test3.mycallable.MycallableB2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by hjy on 17-11-20.
 * 加入显式的try-catch语句块可以捕获异常信息，但抛出去的异常在main()方法中却没有得到捕获，也就是字符串mainA和mainB没有被打印，也就说明子线程出现异常
 * 是是不会影响ｍａｉｎ线程的主流程的，
 */
public class Run2 {

    public static void main(String[] args) {

        try {
            List list = new ArrayList();
            list.add(new MycallableA());
            list.add(new MycallableB2());

            ExecutorService service = Executors.newCachedThreadPool();
            String getString = (String)service.invokeAny(list);
            System.out.println("llllllllll="+getString);
        }catch (InterruptedException e){
            System.out.println("mainA");
            e.printStackTrace();
        }catch (ExecutionException e){
            System.out.println("mainB");
            e.printStackTrace();
        }
    }


}
