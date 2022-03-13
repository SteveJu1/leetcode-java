import java.util.Arrays;

public class P_455 {
    /*
    假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。
对每个孩子 i，都有一个胃口值g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；
并且每块饼干 j，都有一个尺寸 s[j]。
如果 s[j]>= g[i]，我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。
你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
输入: g = [1,2], s = [1,2,3]
输出: 2
解释:
你有两个孩子和三块小饼干，2个孩子的胃口值分别是1,2。
你拥有的饼干数量和尺寸都足以让所有孩子满足。
所以你应该输出2.
     */
    /*
    思路：先排序
         记录孩子数和饼干数
         比较能否满足胃口 能 child + 1
         否则 找下一块饼干
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int childCount = 0;
        int cookieCount=0;

        while (childCount < g.length && cookieCount < s.length) {
            if(g[childCount]<=s[cookieCount]){ //可以满足胃口
                childCount++;
            }
            cookieCount++; // 不能满足使用下一块饼干
        }
        return childCount;

    }
}
