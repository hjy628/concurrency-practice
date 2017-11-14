package chap1.t12.test;

import chap1.t12.exthread.ThreadA;
import chap1.t12.service.Service;

import java.util.concurrent.Semaphore;

/**
 * Created by hjy on 17-11-14.
 */
public class Run {
    public static void main(String[] args) {
      /*  Service service = new Service();
        ThreadA[] a = new ThreadA[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = new ThreadA(service);
            a[i].start();
        }*/



      try {
          Semaphore semaphore = new Semaphore(5);
          semaphore.acquire();
          semaphore.acquire();
          semaphore.acquire();
          semaphore.acquire();
          semaphore.acquire();
          System.out.println(semaphore.availablePermits()); //0
          semaphore.release();
          semaphore.release();
          semaphore.release();
          semaphore.release();
          semaphore.release();
          semaphore.release();
          System.out.println(semaphore.availablePermits()); //6
          semaphore.release(4);
          System.out.println(semaphore.availablePermits()); //10
      }catch (InterruptedException e){
          e.printStackTrace();
      }

    }
}
