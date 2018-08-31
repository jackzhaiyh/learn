package array;

/**
 * @Author: zhai.yh
 * @Date: 2018/8/31 下午9:11
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int len = solution.removeDuplicates(null);
        System.out.println(len);
    }

    private int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return 1;
        }

        int len = nums.length;
        int removeCount = 0;
        for (int i = 0; i < len - 1; i++) {
            while (i + removeCount < nums.length - 1) {
                if (nums[i] == nums[i + removeCount + 1]) {
                    removeCount += 1;
                    len -= 1;
                } else {
                    nums[i + 1] = nums[i + removeCount + 1];
                    break;
                }
            }

        }
        return len;
    }
}
