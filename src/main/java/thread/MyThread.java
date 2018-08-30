package thread;

/**
 * @Author: zhai.yh
 * @Date: 2018/8/24 下午9:23
 */
public class MyThread extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("MyThread:"+i);
        }

    }
}
