package chap10.linkedTransferQueue_1;


/**
 * Created by hjy on 17-11-23.
 */
public class Test1 {

    public static void main(String[] args) {
        MyServiceA service = new MyServiceA();
        ThreadA a = new ThreadA(service);
        a.start();
    }

}
