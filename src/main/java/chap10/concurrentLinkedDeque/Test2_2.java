package chap10.concurrentLinkedDeque;


/**
 * Created by hjy on 17-11-23.
 */
public class Test2_2 {

    public static void main(String[] args) throws InterruptedException{
        MyService1 service = new MyService1();
        service.queue.add("a");
        service.queue.add("b");
        service.queue.add("c");

        System.out.println(service.queue.poll());
    }


}
