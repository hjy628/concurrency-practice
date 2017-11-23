package chap10.oncurrentskiplistmap;

/**
 * Created by hjy on 17-11-23.
 */
public class Test1 {

    public static void main(String[] args) {
        MyService1 service = new MyService1();
        ThreadA a = new ThreadA(service);

        ThreadA b = new ThreadA(service);

        a.start();
        b.start();
    }


}
