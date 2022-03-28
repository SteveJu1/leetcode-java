public class P_190 {
    /*
    https://leetcode-cn.com/problems/reverse-bits/
    位运算
     */
    public int reverseBits(int n) {
        int a = 0;      //首先初始化一个存放结果的整数a
        for (int i = 0; i <= 31; i++) {
            a += (((n >> i) & 1) << (31 - i));
            //首先n>>i表示每次n向右移一位
            //1&一个二进制数表示的是取出该二进制数的最后一位
            //将最后一位取出以后，向左移动31-i位，将其加入到结果中即可。多次循环，最终可以得到目标值。
        }
        return a;
    }
}
