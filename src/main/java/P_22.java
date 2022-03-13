import java.util.ArrayList;
import java.util.List;

public class P_22 {
    /*
    数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
    输入：n = 3
    输出：["((()))","(()())","(())()","()(())","()()()"]
     */
    //  生成所有的可能性 用深度优先
// 先生成所有的左括号 在生成右括号
    private List<String> res;

    public List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        dsf(0, 0, n, "");
        return res;
    }

    /**
     * @param left   左括号已经用了几个
     * @param right  右括号已经用了几个
     * @param n      总的括号有几个
     * @param curStr 当前递归得到的结果
     */
    private void dsf(int left, int right, int n, String curStr) {
        if (left == n && right == n) {  //终止条件
            res.add(curStr);
            return;
        }

        if (left < n) {    //判断括号合法性 left随时加 ，只要不超标
            dsf(left + 1, right, n, curStr + "(");
        }
        if (left > right) {  // left > right
            dsf(left, right + 1, n, curStr + ")");
        }
    }
}
