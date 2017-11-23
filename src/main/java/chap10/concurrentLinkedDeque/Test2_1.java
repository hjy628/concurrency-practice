package chap10.concurrentLinkedDeque;


/**
 * Created by hjy on 17-11-23.
 */
public class Test2_1 {

    public static void main(String[] args) throws InterruptedException{
        MyService1 service = new MyService1();

        System.out.println(service.queue.poll());
    }


}
