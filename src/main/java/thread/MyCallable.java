package thread;

import java.util.concurrent.Callable;

/**
 * @Author: zhai.yh
 * @Date: 2018/8/24 下午9:31
 */
public class MyCallable implements Callable<String> {

    public String call() {

        for (int i = 0; i < 10; i++) {
            System.out.println("MyCallable:"+i);
        }

        return "MyCallable";
    }
}
