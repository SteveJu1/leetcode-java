package Template;

public class FastInvSqrt {
    /*
    二分查找代码模板
    前提：目标函数单调性 递增或者递减
    存在上下界
    可通过索引访问
     */
    public void fastInvSqrt(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
}
