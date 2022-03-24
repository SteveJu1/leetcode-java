public class FriendCircles {
    public int findCirclesNum(int[][] m) {
        int[] visited = new int[m.length];
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            if (visited[i] == 0) {
                dsf(m, visited, i);
                count++;
            }

        }
        return count;
    }
    private void dsf(int[][] m, int[] visited, int i) {
        for (int j = 0; j < m.length; j++) {
            if (m[i][j] == 1 && visited[j] == 0) {
                visited[j] = 1;
                dsf(m, visited, j);
            }

        }
    }
}
