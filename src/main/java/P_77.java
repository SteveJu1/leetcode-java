import java.util.ArrayList;
import java.util.List;

public class P_77 {
    List<Integer> path = new ArrayList<Integer>();
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> combine(int n, int k) {
        dfs(1, n, k);
        return res;
    }

    public void dfs(int cur, int n, int k) {
        // 剪枝：temp 长度加上区间 [cur, n] 的长度小于 k，不可能构造出长度为 k 的 temp
        if (path.size() + (n - cur + 1) < k) {
            return;
        }
        // 记录合法的答案
        if (path.size() == k) {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        // 考虑选择当前位置
        path.add(cur);
        dfs(cur + 1, n, k);
        path.remove(path.size() - 1);
        // 考虑不选择当前位置
        dfs(cur + 1, n, k);
    }
}
