public class P_231 {
    /*
    n & (n - 1) 把二进制最后一个1打掉  100100000001
     */
    public boolean isPowerOfTwo(int n) {
        return (n != 0) && ((n & (n - 1)) == 0);
    }
}
