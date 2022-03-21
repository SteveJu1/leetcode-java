import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P_15 {
/*
    1.暴力 O(n^3)
    2.hashmap a+b=-c n^2
    3.双指针 套路题目
 */
    public List<List<Integer>> threeSum(int[] nums) {
        // 双指针  -4 , -1 , -1, 1 , 2    以-4为起点      -1    2  往中间
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {   //如果遍历的起始元素大于0，就直接退出 最小的数都大于0了，三数之和肯定大于0
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) { //去重，当起始的值等于前一个元素，那么得到的结果将会和前一次相同
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];  //将三数进行相加
                if (sum == 0) {                //如果等于0，将结果对应的索引位置的值加入结果集中
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    //在将左指针和右指针移动的时候，先对左右指针的值，进行判断
                    //如果重复，直接跳过。 因为 i 不变，当此时 l取的数的值与前一个数相同，所以不用在计算，直接跳
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;//将 左指针右移，将右指针左移。
                    right--;
                } else if (sum < 0) {//如果结果小于0，将左指针右移
                    left++;
                } else if (sum > 0) //如果结果大于0，将右指针左移
                    right--;
            }
        }
        return res;
    }
}
