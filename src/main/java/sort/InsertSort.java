package sort;

import java.util.Arrays;

/**
 * 插入排序
 * 1、第一个元素认为已排序
 * 2、取出下一个元素，在一排序序列中从后往前扫描
 * 3、如果该元素大于新元素，则该元素右移
 * 4、重复步骤3，知道一排序元素小于等于新元素
 * 5、将新元素插入该位置
 * 6、重复步骤2
 * O(n^2)
 * 稳定
 * @Author: zhai.yh
 * @Date: 2018/8/29 上午10:42
 */
public class InsertSort {

    public static void insertSort(int[] numbers){
        int size = numbers.length;
        int temp;
        int j;

        for (int i = 0; i < size; i++) {
            temp = numbers[i];

            for (j = i; j > 0 && temp < numbers[j-1]; j--) {
                numbers[j] = numbers[j-1];
            }

            numbers[j] = temp;
        }

    }

    public static void main(String[] args) {
        int[] num = {3,4,6,5,2,1,9,34,0,5,8,2};
        insertSort(num);
        System.out.println(Arrays.toString(num));
    }
}
