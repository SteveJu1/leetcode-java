public class P_33 {
    // 四部做题
    // 所有的解法思考一下
    // 写代码
    // 测试用例
    /*
    二分查找
    输入：nums = [4,5,6,7,0,1,2], target = 0
    输出：4
     */
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            // 检查左半边是否有序并且target不在左半边 说明在右边找
            if (nums[0] <= nums[mid] && (target > nums[mid] || target < nums[0])) {
                left = mid + 1;
                //nums[0] > nums[mid] 左半边存在旋转
            } else if (target < nums[0] && target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left == right && nums[left] == target ? left : -1;
    }

    //第二种写法
    public int search1(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[left] <= nums[mid]) {  //前半部分有序,注意此处用小于等于
                //target在前半部分
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target <= nums[right] && target > nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

        }
        return -1;
    }
}
