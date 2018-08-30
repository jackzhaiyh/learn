package sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 比较相邻的两个元素，按照顺序排列它们
 * O(n^2)
 * 稳定
 * @Author: zhai.yh
 * @Date: 2018/8/29 下午2:14
 */
public class BubbleSort {
    public static void bubbleSort(int[] numbers){
        int size = numbers.length;
        int temp;
        for (int i = size; i > 0 ; i--) {
            for (int j = 0; j < i-1; j++) {
                if(numbers[j] > numbers[j+1]){
                    temp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {3,4,6,5,2,1,9,34,0,5,8,2};
        bubbleSort(num);
        System.out.println(Arrays.toString(num));
    }
}
