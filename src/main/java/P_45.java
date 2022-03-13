public class P_45 {
    /*
给你一个非负整数数组nums ，你最初位于数组的第一个位置。
数组中的每个元素代表你在该位置可以跳跃的最大长度。
你的目标是使用最少的跳跃次数到达数组的最后一个位置。
假设你总是可以到达数组的最后一个位置。

输入: nums = [2,3,1,1,4]
输出: 2
解释: 跳到最后一个位置的最小跳跃数是 2。
从下标为 0 跳到下标为 1 的位置，跳1步，然后跳3步到达数组的最后一个位置
     */
    /*
    用贪心来做 从后往前贪心
    ToDO :没懂啥意思
     */
    public int canJump1(int[] nums) {
        int step = 0;
        int endReachable = nums.length - 1;
        while (endReachable > 0) {
            for (int i = 0; i < endReachable; i++) {
                if (nums[i] + i >= endReachable) {
                    endReachable = i;
                    step++;
                }
            }
        }
        return step;
    }

    public static void main(String[] args) {
        P_45 p_45 = new P_45();
        int[] nums = new int[]{2, 3, 1, 1, 4};
        int step = p_45.canJump1(nums);
    }
}
