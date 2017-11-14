package chap1.repast_test;

import chap1.repast_test.extthread.ThreadC;
import chap1.repast_test.extthread.ThreadP;
import chap1.repast_test.service.RepastService;

import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-14.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException{
        RepastService service = new RepastService();
        ThreadP[] arrayP = new ThreadP[60];
        ThreadC[] arrayC = new ThreadC[60];

        for (int i = 0; i < 60; i++) {
            arrayP[i] = new ThreadP(service);
            arrayC[i] = new ThreadC(service);
        }

        TimeUnit.SECONDS.sleep(2);

        for (int i = 0; i < 60; i++) {
            arrayP[i].start();
            arrayC[i].start();
        }

    }
}
