public class P_200 {
    /*
    给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
    岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
输入：grid = [ ['1','1','1','1','0'],
            ['1','1','0','1','0'],
            ['1','1','0','0','0'],
            ['0','0','0','0','0']]
输出：1
     */
    /*思路：dfs
    用int num 记录岛的个数
    双重遍历每一个点 如果遇到0就跳过
    如果是1 就用dsf调用sink函数
    sink函数的
    终止条件是 0就返回，
    否则 把当前点设为0 并且往四周遍历 如果遇到0就跳过
    如果遇到1 就 sink这个点
    方法结束返回 1 表示这个岛sink完成了 */
    int[] dx = new int[]{-1, 1, 0, 0};  //方向向量
    int[] dy = new int[]{0, 0, -1, 1};
    private char[][] g;

    public int numIslands(char[][] grid) {
        int landsNum = 0;
        g = grid;
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                if (g[i][j] == '0') {
                    continue;
                }
                //g[i][j] = 1为陆地
                landsNum += sink(i, j);
            }
        }
        return landsNum;
    }

    // dfs 把i j 和相邻的点只要是1的话全部变为0 并返回1 表示操作一次
    private int sink(int i, int j) {
        if (g[i][j] == '0') {     //递归终止条件
            return 0;
        }

        g[i][j] = '0';   //当前层的逻辑，把i j对应的点赋为0

        for (int k = 0; k < dx.length; k++) {    // 相邻的点
            int x = i + dx[k];
            int y = j + dy[k];
            if (x >= 0 && x < g.length && y >= 0 && y < g[i].length) { //不超过边界
                if (g[x][y] == '0') continue;
                sink(x, y);  // 1的话继续沉岛
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        P_200 p_200 = new P_200();
        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        p_200.numIslands(grid);
    }
}
