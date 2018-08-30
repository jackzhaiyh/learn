package thread;

/**
 * @Author: zhai.yh
 * @Date: 2018/8/24 下午9:24
 */
public class MyRunnable implements Runnable {

    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("MyRunnable:"+i);
        }
    }
}
