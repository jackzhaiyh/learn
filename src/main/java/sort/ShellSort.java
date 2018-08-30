package sort;

import java.util.Arrays;

/**
 * 希尔排序
 * 选择一个递减的增量序列，最终增量序列递减为1。t1,t2,ti,tj,...,tk。其中ti>tj,tk = 1。
 * 将整个序列按照增量序列分割为若干子序列，分别进行直接插入排序
 *  O(n^2)
 *  不稳定
 * @Author: zhai.yh
 * @Date: 2018/8/29 下午1:59
 */
public class ShellSort {

    public static void shellSort(int[] numbers){
        int size = numbers.length;
        int temp;
        int j;

        for (int inc = size/2; inc > 0; inc /= 2) {

            for (int i = inc; i < size; i++) {
                temp = numbers[i];

                for (j = i; j >= inc && temp < numbers[j-inc]; j -= inc) {
                    numbers[j] = numbers[j - inc];
                }

                numbers[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {3,4,6,5,2,1,9,34,0,5,8,2};
        shellSort(num);
        System.out.println(Arrays.toString(num));
    }

}
