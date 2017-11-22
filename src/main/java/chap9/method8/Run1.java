package chap9.method8;



import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

/**
 * Created by hjy on 17-11-22.
 */
public class Run1 {

    public static void main(String[] args) throws InterruptedException,ExecutionException{


        ForkJoinPool pool = new ForkJoinPool();
        System.out.println("main end             "+new Date());
    }

}
