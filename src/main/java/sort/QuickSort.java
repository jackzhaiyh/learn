package sort;

import java.util.Arrays;

/**
 * 快速排序
 * 首先通过一趟排序将待排序序列分割为两部分，其中一部分元素均比另一部分小，然后继续递归实现
 * O(nlogn)
 * 不稳定
 * @Author: zhai.yh
 * @Date: 2018/8/29 下午2:13
 */
public class QuickSort {

    public static void quickSort(int[] numbers, int left, int right) {
        if(left >= right){
            return;
        }

        int middle = getMiddle(numbers, left, right);
        quickSort(numbers, left, middle-1);
        quickSort(numbers, middle+1, right);
    }


    public static int getMiddle(int[] numbers, int left, int right){
        int p = numbers[left];

        while(left<right){

            while(left < right && numbers[right] >= p){
                right--;
            }
            numbers[left] = numbers[right];

            while(left < right && numbers[left] <= p){
                left++;
            }
            numbers[right] = numbers[left];
        }

        numbers[left] = p;
        return left;
    }

    public static void main(String[] args) {
        int[] num = {3,4,6,5,2,1,9,34,0,5,8,2};
        quickSort(num, 0, num.length-1);
        System.out.println(Arrays.toString(num));
    }

}
