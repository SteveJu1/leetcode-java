public class P_74 {
    /*
    把二维数组换成一维数组
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = m * n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int x = matrix[mid / n][mid % n];
            if (x < target) {
                left = mid + 1;
            } else if (x > target) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

}
