public class P_69 {
    /*
    给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
  由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
     */
    public int mySqrt(int x) {
        int left = 0;
        int right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid <= x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        P_69 p_69 = new P_69();
        p_69.mySqrt(2147395599);
    }
}
