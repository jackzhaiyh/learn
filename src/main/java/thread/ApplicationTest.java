package thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author: zhai.yh
 * @Date: 2018/8/24 下午9:08
 *
 */
public class ApplicationTest {

    public static void main(String[] args){

        //Thread
        MyThread myThread = new MyThread();
        myThread.start();

        //Runnable
        MyRunnable myRunnable = new MyRunnable();
        new Thread(myRunnable).start();

        //Callable
        MyCallable myCallable = new MyCallable();
        FutureTask<String> result = new FutureTask<String>(myCallable);
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
