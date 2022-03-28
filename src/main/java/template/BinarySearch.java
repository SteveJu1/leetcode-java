package template;

public class BinarySearch {
    /*
    二分查找前提
    1. 目标函数单调性
    2. 存在上下界
    3. 能通过索引访问
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
