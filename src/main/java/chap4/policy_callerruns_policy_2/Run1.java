package chap4.policy_callerruns_policy_2;


import chap4.policy_callerruns_policy_2.myrunnable.MyThreadA;

import java.util.Date;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjy on 17-11-16.
 */
public class Run1 {

    public static void main(String[] args) throws InterruptedException{
        MyThreadA a = new MyThreadA();

        a.setName("AA");
        a.start();

        System.out.println("main end");

    }



}
