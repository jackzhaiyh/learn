package thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author: zhai.yh
 * @Date: 2018/8/24 下午9:08
 *
 */
public class ThreadTest {

    public static void main(String[] args){

        //Thread
        MyThread myThread = new MyThread();

        //Runnable
        MyRunnable myRunnable = new MyRunnable();

        //Callable
        MyCallable myCallable = new MyCallable();
        FutureTask<String> result = new FutureTask<String>(myCallable);

        myThread.start();
        new Thread(myRunnable).start();
        new Thread(result).start();

        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

}
