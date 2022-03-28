package template;

public class DynamicProgramming {
    /*
    动态递推
    用递归的方式
    把复杂问题 分治 成小问题
    找的重复子问题
    最优子结构，中途淘汰次优解

    场景：求最优解 最大值 所以需要 状态储存数组
     */
    int[] memo;

    /*
    自顶向下 加记忆化搜索
     */
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] == 0) {
            memo[n] = fib(n - 1) + fib(n - 2);
        }
        return memo[n];
    }

    /*
    自底向上的思路 ： 递推的方式用循环 动态递推
     */
    public int f(int n) {
        int[] a = new int[]{};
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i <= n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[n];
    }

}
