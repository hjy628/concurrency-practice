package chap1.semaphore_pool_list;

import chap1.semaphore_pool_list.extthread.MyThread;
import chap1.semaphore_pool_list.tools.ListPool;

/**
 * Created by hjy on 17-11-14.
 */
public class Run {

    public static void main(String[] args) {
        ListPool pool = new ListPool();

        MyThread[] threadArray = new MyThread[12];
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i] = new MyThread(pool);
        }
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i].start();
        }
    }

}
