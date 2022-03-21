import java.util.ArrayList;
import java.util.List;

public class P_78 {
    /*
    1.回溯的算法
    2.迭代
     */
    private List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        if (nums == null) return res;

        dsf(nums, new ArrayList<Integer>(), 0);
        return res;
    }

    private void dsf(int[] nums, List<Integer> path, int index) { //index 代表在那一层递归
        if (index == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        dsf(nums, path, index + 1);  //not pick number at this index 当前层可选可不选

        path.add(nums[index]);
        dsf(nums, path, index + 1); // 选择当前值
        //reverse state
        path.remove(path.size() - 1);
    }
}
