public class P_55 {
    /*
给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
数组中的每个元素代表你在该位置可以跳跃的最大长度。判断你是否能够到达最后一个下标。
输入：nums = [2,3,1,1,4]
输出：true
解释：可以先跳 1 步，从下标 0 到达下标 1, 然后再从下标 1 跳 3 步到达最后一个下标。
     */
    /*
    用贪心来做
     */
    public boolean canJump(int[] nums) {
        int rightmost = 0; //记录最远的位置
        for (int i = 0; i < nums.length; i++) {
            if (i <= rightmost) {
                rightmost = Math.max(rightmost, i + nums[i]); //当前的位置 + 能跳多远
                if (rightmost >= nums.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /*
    从后往前贪心
     */
    public boolean canJump1(int[] nums) {
        if (nums == null) {
            return false;
        }
        int endReachable = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] + i >= endReachable) {
                endReachable = i;
            }
        }
        return endReachable == 0;
    }

    public static void main(String[] args) {
        P_55 p_55 = new P_55();
        int[] nums = new int[]{2, 3, 1, 1, 4};
        p_55.canJump1(nums);
    }
}
