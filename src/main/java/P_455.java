import java.util.Arrays;

public class P_455 {
    /*
    https://leetcode-cn.com/problems/assign-cookies/
     */
    /*
    思路：两个数组先排序
         两个变量记录 孩子和饼干位置
         比较能否满足胃口
            child + 1
         否则
            饼干+1
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int childCount = 0;
        int cookieCount = 0;

        while (childCount < g.length && cookieCount < s.length) {
            if (g[childCount] <= s[cookieCount]) { //可以满足胃口
                childCount++;
            }
            cookieCount++; // 不能满足使用下一块饼干
        }
        return childCount;
    }
}
