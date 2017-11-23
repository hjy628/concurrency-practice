package chap10.concurrentHashMap;


/**
 * Created by hjy on 17-11-23.
 */
public class Test1_1 {

    public static void main(String[] args) throws InterruptedException{
        MyService1 service = new MyService1();

        Thread1A a = new Thread1A(service);

        a.start();
    }

}
