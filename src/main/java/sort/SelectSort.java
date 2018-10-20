package sort;

import java.util.Arrays;

/**
 * ClassName: SelectSort <br/>
 * Date: 2018年10月20日 下午8:27:39 <br/>
 *
 * @author zhaiyh 
 * @version v1.0
 */
public class SelectSort {
	
	public static int getMinIndex(int[] num, int l, int r) {
		int idx = l;
		for(int i=l; i < r; i++) {
			if(num[i] < num[idx]) {
				idx = i;
			}
		}
		return idx;
	};
	
	public static void selectSort(int[] num) {
		int r = num.length;
		int temp;
		for(int i=0; i < r; i++) {
			int idx = getMinIndex(num,i,r);
			temp = num[i];
			num[i] = num[idx];
			num[idx] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] num = {3,4,6,5,2,1,9,34,0,5,8,2};
		selectSort(num);
        System.out.println(Arrays.toString(num));
	}
}
