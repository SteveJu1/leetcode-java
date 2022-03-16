public class P_152 {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int res = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<0){
                max = Math.max(max * nums[i], nums[i]);
                min = Math.min(min * nums[i], nums[i]);
                res= Math.max(max, min);
            };
        }
        return res;
    }
}
