public class P_26 {
    /*
    https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
     */
    public int removeDuplicates(int[] nums) {
        int i = 0; //i 移动到不重复数字的最后
        int j = 1;// j在数组上移动
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
            j++;
        }
        return i + 1;
    }
}
