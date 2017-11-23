package chap10.concurrentHashMap;


/**
 * Created by hjy on 17-11-23.
 */
public class Test3 {

    public static void main(String[] args) throws InterruptedException{
        MyService3 service = new MyService3();

        Thread3A a = new Thread3A(service);
        Thread3B b = new Thread3B(service);

        a.start();
        b.start();

        a.join();
        b.join();
        System.out.println(service.map.size());

    }

}
