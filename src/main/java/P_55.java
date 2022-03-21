public class P_55 {
    /*
    https://leetcode-cn.com/problems/jump-game/
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
