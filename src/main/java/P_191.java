public class P_191 {
    /*
    1. for loop : 0 --> 32
    2.  &1 最低位是否是0或1 x=x>>1;
    3. while(x!=0) { count++； x = x & (x-1)} 清零最低位1
    如果判断x>0 则首位1不能处理
     */
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {  //
            res++;
            n = n & (n - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        P_191 p_191 = new P_191();
        p_191.hammingWeight(1);
    }
}
