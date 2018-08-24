package thread;

import java.util.concurrent.Callable;

/**
 * @Author: zhai.yh
 * @Date: 2018/8/24 下午9:31
 */
public class MyCallable implements Callable<String> {

    public String call() {
        return "MyCallable";
    }
}
