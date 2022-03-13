public class P_50 {

    /*
    分治 ： 1.终止 2.处理（split big problem）3.drill down  merge  4 reverse states
     */
    public double myPow(double x, int n) {
        return n >= 0 ? quickPow(x, n) : 1 / quickPow(x, -n);
    }

    public double quickPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double half = quickPow(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

}
