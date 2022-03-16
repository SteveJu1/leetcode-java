import java.util.List;

public class P_120 {
    /*
    1.brute-force 递归
    2.DP
    a.重复性   problem(i,j) = min(sub(i+1,j) ,sub(i+1,j+1))  + a[i,j]
    b.定义状态数组  DP[i,j]
    c.DP方程  dp[i,j] = min(dp[i+1,j],dp[i+1][j+1]) +triangle[i][j]
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        int[] dp = new int[row + 1];

        for (int i = row - 1; i >= 0; i--) {  //从底往上遍历
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }

    public int minimumTotal1(List<List<Integer>> triangle) {
        int size = triangle.size();
        int[] dp = new int[size + 1];

        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }

    /*
    递归方式 指数级别
     */
    public int minimumTotal2(List<List<Integer>> triangle) {
        int size = triangle.size();
        int[] dp = new int[size + 1];

        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }
}
