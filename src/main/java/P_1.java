import java.util.HashMap;
import java.util.Map;

public class P_1 {
    /*
    输入：nums = [2,7,11,15], target = 9
输出：[0,1]
解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
     */
/*
思路：先循环数组 用hashmap存
     在循环去查
 */

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);   // 索引是value
        }

        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(target - nums[i]);  //get() retrun:value
            if (index != null && index != i) {
                int[] ret = {i, index};
                return ret;
            }
        }
        throw new IllegalStateException("no solution");
    }
}
