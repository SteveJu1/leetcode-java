package Template;

public class DynamicProgramming {
    /*
    动态递推
    用递归的方式 把复杂问题分治成小问题
  找的重复子问题  最优子结构，中途淘汰次优解

     */
    int[] memo;

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] == 0) {
            memo[n] = fib(n - 1) + fib(n - 2);
        }
        return memo[n];
    }

    public int f(int n) {
        int[] a = new int[]{};
        a[0] = 0;
        a[1] = 1;
        for (int i = 0; i <= n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[n];
    }

}
